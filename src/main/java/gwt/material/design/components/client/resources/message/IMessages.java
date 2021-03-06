package gwt.material.design.components.client.resources.message;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;
public interface IMessages extends Messages {

	public static final IMessages INSTANCE = GWT.create(IMessages.class);
	
	@DefaultMessage("Months: 1 to 12")
	@AlternateMessage({
		"1", "January", 
		"2", "February", 
		"3", "March", 
		"4", "April", 
		"5", "May", 
		"6", "June", 
		"7", "July", 
		"8", "August", 
		"9", "September", 
		"10", "October", 
		"11", "November", 
		"12", "December"})
	String mdc_calendar_full_month(@Select int month);
	
	@DefaultMessage("Months: 1 to 12")
	@AlternateMessage({
		"1", "Jan", 
		"2", "Feb", 
		"3", "Mar", 
		"4", "Apr", 
		"5", "May", 
		"6", "Jun", 
		"7", "Jul", 
		"8", "Aug", 
		"9", "Sep", 
		"10", "Oct", 
		"11", "Nov", 
		"12", "Dec"})
	String mdc_calendar_short_month(@Select int month);
	
	@DefaultMessage("Week 1 to 7")
	@AlternateMessage({
		"1", "Sunday", 
		"2", "Monday", 
		"3", "Tuesday", 
		"4", "Wednesday", 
		"5", "Thursday", 
		"6", "Friday", 
		"7", "Saturday"})
	String mdc_calendar_full_week(@Select int day);
	
	@DefaultMessage("Week 1 to 7")
	@AlternateMessage({
		"1", "Sun", 
		"2", "Mon", 
		"3", "Tue", 
		"4", "Wed", 
		"5", "Thu", 
		"6", "Fri", 
		"7", "Sat"})
	String mdc_calendar_short_week(@Select int day);
	
	@DefaultMessage("Week 1 to 7")
	@AlternateMessage({
		"1", "S", 
		"2", "M", 
		"3", "T", 
		"4", "W", 
		"5", "T", 
		"6", "F", 
		"7", "S"})
	String mdc_calendar_letter_week(@Select int day);
	
	@DefaultMessage("dd")
	String mdc_calendar_dd();
	
	@DefaultMessage("mm")
	String mdc_calendar_mm();
	
	@DefaultMessage("yyyy")
	String mdc_calendar_yyyy();
	
	@DefaultMessage("{0}, {1} {2}")
	String mdc_calendar_header_day(String weekDay, String month, int day);
	
	@DefaultMessage("{0}, {1} {2} {3}")
	String mdc_calendar_header_full_day(String weekDay, int day, String month, int year);
	
	@DefaultMessage("{1} {0}")
	String mdc_calendar_body_month(String month, int year);
	
	@DefaultMessage("Initial date")
	String mdc_calendar_initial_date();
	
	@DefaultMessage("Final date")
	String mdc_calendar_final_date();
	
	@DefaultMessage("Hoje")
	String mdc_calendar_today();
	
	@DefaultMessage("Clear")
	String mdc_calendar_clear();
	
	@DefaultMessage("Ok")
	String mdc_calendar_ok();
	
	@DefaultMessage("Cancel")
	String mdc_calendar_cancel();
	
	@DefaultMessage("{0}, {1} {2} {3}")
	String mdc_date__to_string(String weekDay, int day, String month, int year);
	
	@DefaultMessage("{0} is invalid. The defined year must be greater than or equal to 0.")
	String mdc_date__err__year_out_of_range(int year);
	
	@DefaultMessage("{0} is invalid. The defined month must be greater than or equal to 1 and less than or equal to 12.")
	String mdc_date__err__month_out_of_range(int month);
	
	@DefaultMessage("The day {0} is invalid, because the first day of the month is 1.")
	String mdc_date__err__day_smaller_than_first_day_of_month(int settedDay);
	
	@DefaultMessage("The day {3} is invalid, because in {0}, {1} go to until the day {2}.")
	String mdc_date__err__day_bigger_than_last_day_of_month(int year, int month, int lastDayOfMonth, int settedDay);
	
	@DefaultMessage("Password is very weak")
	String mdc_validation__password__very_weak();
		
	@DefaultMessage("Password is weak")
	String mdc_validation__password__weak();
	
	@DefaultMessage("Password is medium")
	String mdc_validation__password__midium();

	@DefaultMessage("Password is strong")
	String mdc_validation__password__strong();
	
	@DefaultMessage("Password is very strong")
	String mdc_validation__password__very_strong();
	
	@DefaultMessage("The text should has {0} or more characters")
	String mdc_validation__less_than_min_length(int minLenght);
	
	@DefaultMessage("The text should has {0} or less characters")
	String mdc_validation__more_than_max_length(int maxLenght);
	
	@DefaultMessage("This field cannot be empty")
	String mdc_validation__required();
	
	@DefaultMessage("The value is invalid")
	String mdc_validation__value_invalid();
	
	@DefaultMessage("Max number of files exceeded. You can upload a maximum of {0} files.")
	String mdc_file_upload__err__max_number_of_files_exceeded(int maxNumberOfFiles);
	
	@DefaultMessage("Max limit multi upload size was exceeded. You can upload a maximum of {0} and you are uploading {1}.")
	String mdc_file_upload__err__max_limit_multi_upload_size_exceeded(String limitMultiFileUploadSize, String uploading);
	
	@DefaultMessage("File size is too big. Max size is {0} and {1} has {2}.")
	String mdc_file_upload__err__file_size_is_too_bg(String maxSize, String file, String size);
	
	@DefaultMessage("Insert a new row")
	String mdc_jexcel_insert_row();
	
	@DefaultMessage("Insert a new column")
	String mdc_jexcel_insert_column();
	
	@DefaultMessage("Delete this row")
	String mdc_jexcel_delete_row();
	
	@DefaultMessage("Delete this column")
	String mdc_jexcel_delete_column();
	
	@DefaultMessage("Copy...")
	String mdc_jexcel_copy();
	
	@DefaultMessage("About")
	String mdc_jexcel_about();
	
	@DefaultMessage("Save as...")
	String mdc_jexcel_save_as();
	
	@DefaultMessage("Order ascending")
	String mdc_jexcel_order_ascending();
	
	@DefaultMessage("Order descending")
	String mdc_jexcel_order_descending();
	
	@DefaultMessage("Filter for")
	String mdc_datatable__filter_for();
	
	@DefaultMessage("Search")
	String mdc_datatable__search();
	

	@DefaultMessage(": activate to sort column ascending")
	String mdc_datatable__aria__sort_ascending();
	
	@DefaultMessage(": activate to sort column descending")
	String mdc_datatable__aria__sort_descending();
	
	@DefaultMessage("No data available in table")
	String mdc_datatable__empty_table();

	@DefaultMessage("{0} - {1} of {2}")
	String mdc_datatable__info(final String start, final String end, final String total);
	
	@DefaultMessage("0 of ")
	String mdc_datatable__info_empty();
	
	@DefaultMessage("_MAX_")
	String mdc_datatable__info_filtered();

	@DefaultMessage("")
	String mdc_datatable__info_post_fix();
	
	@DefaultMessage("Rows per page:  {0}")
	String mdc_datatable__length_menu(final String total);
	
	@DefaultMessage("Loading...")
	String mdc_datatable__loading_records();

	@DefaultMessage("Processing...")
	String mdc_datatable__processing();
	
	@DefaultMessage("No matching records found")
	String mdc_datatable__zero_records();
	
	@DefaultMessage("Selected %d rows")
	String mdc_datatable__select__rows__defauld();
	
	@DefaultMessage("Click a row to select it")
	String mdc_datatable__select__rows__zero_recoreds();
	
	@DefaultMessage("Selected 1 row")
	String mdc_datatable__select__rows__one_recoreds();
	
	@DefaultMessage("Selected %d columns")
	String mdc_datatable__select__columns__defauld();
	
	@DefaultMessage("Click a column to select it")
	String mdc_datatable__select__columns__zero_recoreds();
	
	@DefaultMessage("Selected 1 column")
	String mdc_datatable__select__columns__one_recoreds();
	
	@DefaultMessage("Selected %d cells")
	String mdc_datatable__select__cells__defauld();
	
	@DefaultMessage("Click a cell to select it")
	String mdc_datatable__select__cells__zero_recoreds();
	
	@DefaultMessage("Selected 1 cell")
	String mdc_datatable__select__cells__one_recoreds();
}
