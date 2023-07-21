import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UpdateIconType {

	static final String GOOGLE_ICONS = "https://raw.githubusercontent.com/google/material-design-icons/master/font/MaterialIcons-Regular.codepoints";
	static final String LINE_FORMAT = "	/** <html><head><link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\"></head><body><span class=\"material-icons\">%s</span></body></html> */\n	%s%s(\"%s\"),";
	
	public static void main(String[] args) throws Exception {

		final Set<String> icons = icons();
		//icons.forEach(System.out::println);
		
		final List<String> values = new LinkedList<>();
		values.add("	// @formatter:off");
		values.add("	DEFAULT(\"\"),");
		icons
			.stream()
			.map(icon -> String.format(LINE_FORMAT, icon, (Character.isDigit(icon.charAt(0)) ? "_" : ""),  icon.toUpperCase(), icon))
			.forEach(values::add);
		values.add("	// @formatter:on");

		final EnumClass enumClass = EnumClass
				.getClass("src\\main\\java\\gwt\\material\\design\\components\\client\\constants", "IconType");
		
		enumClass.setValues(values).write();
		
	}

	@SuppressWarnings("deprecation")
	static Set<String> icons() throws IOException {

		final Set<String> icons = new LinkedHashSet<>();
		final URL googleIcons = new URL(GOOGLE_ICONS);
		final URLConnection connection = googleIcons.openConnection();
		final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			final String icon = inputLine.split(" ")[0];
			if (!icon.isEmpty())
				icons.add(icon);
		}

		in.close();

		return icons;
	}

	static class EnumClass {

		private final String className;
		private final String path;
		private final File file;

		private final List<String> classHeader = new LinkedList<>();
		private final List<String> classValues = new LinkedList<>();
		private final List<String> classFooter = new LinkedList<>();

		static EnumClass getClass(final String path, final String className) throws IOException {
			return new EnumClass(path, className);
		}

		public EnumClass(final String path, final String className) throws IOException {
			super();
			this.className = className.replace(".java", "");
			this.path = path;
			this.file = new File(this.path + "\\" + this.className + ".java");
			this.loadFile();
		}

		public List<String> getLines() {
			final List<String> lines = new LinkedList<>();
			lines.addAll(classHeader);
			lines.addAll(classValues);
			lines.addAll(classFooter);
			return lines;
		}

		public EnumClass setValues(final List<String> values) {
			this.classValues.clear();
			this.classValues.addAll(values);
			return this;
		}

		public void write() throws IOException {
			final FileWriter fileWrite = new FileWriter(file);
			final BufferedWriter out = new BufferedWriter(fileWrite);
			for (String s : getLines()) {
				out.write(s);
				out.write('\n');
			}
			out.flush();
			out.close();
		}

		private void loadFile() throws IOException {

			this.classHeader.clear();
			this.classValues.clear();
			this.classFooter.clear();

			final FileReader fileReader = new FileReader(file);
			final BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;

			// Read header
			while ((line = bufferedReader.readLine()) != null) {
				classHeader.add(line);
				if (line.trim().endsWith("{"))
					break;
			}

			// Read values
			while ((line = bufferedReader.readLine()) != null) {
				classValues.add(line);
				if (line.trim().endsWith(";"))
					break;
			}

			// Read values
			classFooter.add("	;");
			while ((line = bufferedReader.readLine()) != null) {				
				classFooter.add(line);
			}

			fileReader.close();
			bufferedReader.close();

		}

	}
}
