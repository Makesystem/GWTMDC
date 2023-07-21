/*
 * #%L
 * Gwt Material Design Components
 * %%
 * Copyright (C) 2017 - 2017 Gwt Material Design Components
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.components.client.constants;

import gwt.material.design.components.client.utils.helper.EnumHelper;

/**
 * 
 * @author Richeli Vargas
 *
 */
public enum IconType implements CssType {
	// @formatter:off
	DEFAULT(""),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">10k</span></body></html> */
	_10K("10k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">10mp</span></body></html> */
	_10MP("10mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">11mp</span></body></html> */
	_11MP("11mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">123</span></body></html> */
	_123("123"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">12mp</span></body></html> */
	_12MP("12mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">13mp</span></body></html> */
	_13MP("13mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">14mp</span></body></html> */
	_14MP("14mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">15mp</span></body></html> */
	_15MP("15mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">16mp</span></body></html> */
	_16MP("16mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">17mp</span></body></html> */
	_17MP("17mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">18_up_rating</span></body></html> */
	_18_UP_RATING("18_up_rating"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">18mp</span></body></html> */
	_18MP("18mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">19mp</span></body></html> */
	_19MP("19mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">1k</span></body></html> */
	_1K("1k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">1k_plus</span></body></html> */
	_1K_PLUS("1k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">1x_mobiledata</span></body></html> */
	_1X_MOBILEDATA("1x_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">20mp</span></body></html> */
	_20MP("20mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">21mp</span></body></html> */
	_21MP("21mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">22mp</span></body></html> */
	_22MP("22mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">23mp</span></body></html> */
	_23MP("23mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">24mp</span></body></html> */
	_24MP("24mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">2k</span></body></html> */
	_2K("2k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">2k_plus</span></body></html> */
	_2K_PLUS("2k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">2mp</span></body></html> */
	_2MP("2mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">30fps</span></body></html> */
	_30FPS("30fps"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">30fps_select</span></body></html> */
	_30FPS_SELECT("30fps_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">360</span></body></html> */
	_360("360"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">3d_rotation</span></body></html> */
	_3D_ROTATION("3d_rotation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">3g_mobiledata</span></body></html> */
	_3G_MOBILEDATA("3g_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">3k</span></body></html> */
	_3K("3k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">3k_plus</span></body></html> */
	_3K_PLUS("3k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">3mp</span></body></html> */
	_3MP("3mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">3p</span></body></html> */
	_3P("3p"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">4g_mobiledata</span></body></html> */
	_4G_MOBILEDATA("4g_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">4g_plus_mobiledata</span></body></html> */
	_4G_PLUS_MOBILEDATA("4g_plus_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">4k</span></body></html> */
	_4K("4k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">4k_plus</span></body></html> */
	_4K_PLUS("4k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">4mp</span></body></html> */
	_4MP("4mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">5g</span></body></html> */
	_5G("5g"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">5k</span></body></html> */
	_5K("5k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">5k_plus</span></body></html> */
	_5K_PLUS("5k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">5mp</span></body></html> */
	_5MP("5mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">60fps</span></body></html> */
	_60FPS("60fps"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">60fps_select</span></body></html> */
	_60FPS_SELECT("60fps_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">6_ft_apart</span></body></html> */
	_6_FT_APART("6_ft_apart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">6k</span></body></html> */
	_6K("6k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">6k_plus</span></body></html> */
	_6K_PLUS("6k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">6mp</span></body></html> */
	_6MP("6mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">7k</span></body></html> */
	_7K("7k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">7k_plus</span></body></html> */
	_7K_PLUS("7k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">7mp</span></body></html> */
	_7MP("7mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">8k</span></body></html> */
	_8K("8k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">8k_plus</span></body></html> */
	_8K_PLUS("8k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">8mp</span></body></html> */
	_8MP("8mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">9k</span></body></html> */
	_9K("9k"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">9k_plus</span></body></html> */
	_9K_PLUS("9k_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">9mp</span></body></html> */
	_9MP("9mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">abc</span></body></html> */
	ABC("abc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ac_unit</span></body></html> */
	AC_UNIT("ac_unit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">access_alarm</span></body></html> */
	ACCESS_ALARM("access_alarm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">access_alarms</span></body></html> */
	ACCESS_ALARMS("access_alarms"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">access_time</span></body></html> */
	ACCESS_TIME("access_time"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">access_time_filled</span></body></html> */
	ACCESS_TIME_FILLED("access_time_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">accessibility</span></body></html> */
	ACCESSIBILITY("accessibility"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">accessibility_new</span></body></html> */
	ACCESSIBILITY_NEW("accessibility_new"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">accessible</span></body></html> */
	ACCESSIBLE("accessible"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">accessible_forward</span></body></html> */
	ACCESSIBLE_FORWARD("accessible_forward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">account_balance</span></body></html> */
	ACCOUNT_BALANCE("account_balance"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">account_balance_wallet</span></body></html> */
	ACCOUNT_BALANCE_WALLET("account_balance_wallet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">account_box</span></body></html> */
	ACCOUNT_BOX("account_box"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">account_circle</span></body></html> */
	ACCOUNT_CIRCLE("account_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">account_tree</span></body></html> */
	ACCOUNT_TREE("account_tree"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ad_units</span></body></html> */
	AD_UNITS("ad_units"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">adb</span></body></html> */
	ADB("adb"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add</span></body></html> */
	ADD("add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_a_photo</span></body></html> */
	ADD_A_PHOTO("add_a_photo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_alarm</span></body></html> */
	ADD_ALARM("add_alarm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_alert</span></body></html> */
	ADD_ALERT("add_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_box</span></body></html> */
	ADD_BOX("add_box"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_business</span></body></html> */
	ADD_BUSINESS("add_business"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_call</span></body></html> */
	ADD_CALL("add_call"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_card</span></body></html> */
	ADD_CARD("add_card"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_chart</span></body></html> */
	ADD_CHART("add_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_circle</span></body></html> */
	ADD_CIRCLE("add_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_circle_outline</span></body></html> */
	ADD_CIRCLE_OUTLINE("add_circle_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_comment</span></body></html> */
	ADD_COMMENT("add_comment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_home</span></body></html> */
	ADD_HOME("add_home"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_home_work</span></body></html> */
	ADD_HOME_WORK("add_home_work"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_ic_call</span></body></html> */
	ADD_IC_CALL("add_ic_call"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_link</span></body></html> */
	ADD_LINK("add_link"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_location</span></body></html> */
	ADD_LOCATION("add_location"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_location_alt</span></body></html> */
	ADD_LOCATION_ALT("add_location_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_moderator</span></body></html> */
	ADD_MODERATOR("add_moderator"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_photo_alternate</span></body></html> */
	ADD_PHOTO_ALTERNATE("add_photo_alternate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_reaction</span></body></html> */
	ADD_REACTION("add_reaction"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_road</span></body></html> */
	ADD_ROAD("add_road"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_shopping_cart</span></body></html> */
	ADD_SHOPPING_CART("add_shopping_cart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_task</span></body></html> */
	ADD_TASK("add_task"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_to_drive</span></body></html> */
	ADD_TO_DRIVE("add_to_drive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_to_home_screen</span></body></html> */
	ADD_TO_HOME_SCREEN("add_to_home_screen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_to_photos</span></body></html> */
	ADD_TO_PHOTOS("add_to_photos"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">add_to_queue</span></body></html> */
	ADD_TO_QUEUE("add_to_queue"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">addchart</span></body></html> */
	ADDCHART("addchart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">adf_scanner</span></body></html> */
	ADF_SCANNER("adf_scanner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">adjust</span></body></html> */
	ADJUST("adjust"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">admin_panel_settings</span></body></html> */
	ADMIN_PANEL_SETTINGS("admin_panel_settings"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">adobe</span></body></html> */
	ADOBE("adobe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ads_click</span></body></html> */
	ADS_CLICK("ads_click"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">agriculture</span></body></html> */
	AGRICULTURE("agriculture"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">air</span></body></html> */
	AIR("air"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_flat</span></body></html> */
	AIRLINE_SEAT_FLAT("airline_seat_flat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_flat_angled</span></body></html> */
	AIRLINE_SEAT_FLAT_ANGLED("airline_seat_flat_angled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_individual_suite</span></body></html> */
	AIRLINE_SEAT_INDIVIDUAL_SUITE("airline_seat_individual_suite"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_legroom_extra</span></body></html> */
	AIRLINE_SEAT_LEGROOM_EXTRA("airline_seat_legroom_extra"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_legroom_normal</span></body></html> */
	AIRLINE_SEAT_LEGROOM_NORMAL("airline_seat_legroom_normal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_legroom_reduced</span></body></html> */
	AIRLINE_SEAT_LEGROOM_REDUCED("airline_seat_legroom_reduced"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_recline_extra</span></body></html> */
	AIRLINE_SEAT_RECLINE_EXTRA("airline_seat_recline_extra"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_seat_recline_normal</span></body></html> */
	AIRLINE_SEAT_RECLINE_NORMAL("airline_seat_recline_normal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airline_stops</span></body></html> */
	AIRLINE_STOPS("airline_stops"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airlines</span></body></html> */
	AIRLINES("airlines"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airplane_ticket</span></body></html> */
	AIRPLANE_TICKET("airplane_ticket"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airplanemode_active</span></body></html> */
	AIRPLANEMODE_ACTIVE("airplanemode_active"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airplanemode_inactive</span></body></html> */
	AIRPLANEMODE_INACTIVE("airplanemode_inactive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airplanemode_off</span></body></html> */
	AIRPLANEMODE_OFF("airplanemode_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airplanemode_on</span></body></html> */
	AIRPLANEMODE_ON("airplanemode_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airplay</span></body></html> */
	AIRPLAY("airplay"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">airport_shuttle</span></body></html> */
	AIRPORT_SHUTTLE("airport_shuttle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">alarm</span></body></html> */
	ALARM("alarm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">alarm_add</span></body></html> */
	ALARM_ADD("alarm_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">alarm_off</span></body></html> */
	ALARM_OFF("alarm_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">alarm_on</span></body></html> */
	ALARM_ON("alarm_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">album</span></body></html> */
	ALBUM("album"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">align_horizontal_center</span></body></html> */
	ALIGN_HORIZONTAL_CENTER("align_horizontal_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">align_horizontal_left</span></body></html> */
	ALIGN_HORIZONTAL_LEFT("align_horizontal_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">align_horizontal_right</span></body></html> */
	ALIGN_HORIZONTAL_RIGHT("align_horizontal_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">align_vertical_bottom</span></body></html> */
	ALIGN_VERTICAL_BOTTOM("align_vertical_bottom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">align_vertical_center</span></body></html> */
	ALIGN_VERTICAL_CENTER("align_vertical_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">align_vertical_top</span></body></html> */
	ALIGN_VERTICAL_TOP("align_vertical_top"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">all_inbox</span></body></html> */
	ALL_INBOX("all_inbox"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">all_inclusive</span></body></html> */
	ALL_INCLUSIVE("all_inclusive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">all_out</span></body></html> */
	ALL_OUT("all_out"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">alt_route</span></body></html> */
	ALT_ROUTE("alt_route"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">alternate_email</span></body></html> */
	ALTERNATE_EMAIL("alternate_email"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">amp_stories</span></body></html> */
	AMP_STORIES("amp_stories"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">analytics</span></body></html> */
	ANALYTICS("analytics"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">anchor</span></body></html> */
	ANCHOR("anchor"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">android</span></body></html> */
	ANDROID("android"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">animation</span></body></html> */
	ANIMATION("animation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">announcement</span></body></html> */
	ANNOUNCEMENT("announcement"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">aod</span></body></html> */
	AOD("aod"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">apartment</span></body></html> */
	APARTMENT("apartment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">api</span></body></html> */
	API("api"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">app_blocking</span></body></html> */
	APP_BLOCKING("app_blocking"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">app_registration</span></body></html> */
	APP_REGISTRATION("app_registration"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">app_settings_alt</span></body></html> */
	APP_SETTINGS_ALT("app_settings_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">app_shortcut</span></body></html> */
	APP_SHORTCUT("app_shortcut"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">apple</span></body></html> */
	APPLE("apple"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">approval</span></body></html> */
	APPROVAL("approval"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">apps</span></body></html> */
	APPS("apps"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">apps_outage</span></body></html> */
	APPS_OUTAGE("apps_outage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">architecture</span></body></html> */
	ARCHITECTURE("architecture"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">archive</span></body></html> */
	ARCHIVE("archive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">area_chart</span></body></html> */
	AREA_CHART("area_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_back</span></body></html> */
	ARROW_BACK("arrow_back"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_back_ios</span></body></html> */
	ARROW_BACK_IOS("arrow_back_ios"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_back_ios_new</span></body></html> */
	ARROW_BACK_IOS_NEW("arrow_back_ios_new"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_circle_down</span></body></html> */
	ARROW_CIRCLE_DOWN("arrow_circle_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_circle_left</span></body></html> */
	ARROW_CIRCLE_LEFT("arrow_circle_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_circle_right</span></body></html> */
	ARROW_CIRCLE_RIGHT("arrow_circle_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_circle_up</span></body></html> */
	ARROW_CIRCLE_UP("arrow_circle_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_downward</span></body></html> */
	ARROW_DOWNWARD("arrow_downward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_drop_down</span></body></html> */
	ARROW_DROP_DOWN("arrow_drop_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_drop_down_circle</span></body></html> */
	ARROW_DROP_DOWN_CIRCLE("arrow_drop_down_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_drop_up</span></body></html> */
	ARROW_DROP_UP("arrow_drop_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_forward</span></body></html> */
	ARROW_FORWARD("arrow_forward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_forward_ios</span></body></html> */
	ARROW_FORWARD_IOS("arrow_forward_ios"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_left</span></body></html> */
	ARROW_LEFT("arrow_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_outward</span></body></html> */
	ARROW_OUTWARD("arrow_outward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_right</span></body></html> */
	ARROW_RIGHT("arrow_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_right_alt</span></body></html> */
	ARROW_RIGHT_ALT("arrow_right_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">arrow_upward</span></body></html> */
	ARROW_UPWARD("arrow_upward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">art_track</span></body></html> */
	ART_TRACK("art_track"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">article</span></body></html> */
	ARTICLE("article"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">aspect_ratio</span></body></html> */
	ASPECT_RATIO("aspect_ratio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assessment</span></body></html> */
	ASSESSMENT("assessment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment</span></body></html> */
	ASSIGNMENT("assignment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment_add</span></body></html> */
	ASSIGNMENT_ADD("assignment_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment_ind</span></body></html> */
	ASSIGNMENT_IND("assignment_ind"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment_late</span></body></html> */
	ASSIGNMENT_LATE("assignment_late"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment_return</span></body></html> */
	ASSIGNMENT_RETURN("assignment_return"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment_returned</span></body></html> */
	ASSIGNMENT_RETURNED("assignment_returned"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assignment_turned_in</span></body></html> */
	ASSIGNMENT_TURNED_IN("assignment_turned_in"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assist_walker</span></body></html> */
	ASSIST_WALKER("assist_walker"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assistant</span></body></html> */
	ASSISTANT("assistant"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assistant_direction</span></body></html> */
	ASSISTANT_DIRECTION("assistant_direction"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assistant_navigation</span></body></html> */
	ASSISTANT_NAVIGATION("assistant_navigation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assistant_photo</span></body></html> */
	ASSISTANT_PHOTO("assistant_photo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">assured_workload</span></body></html> */
	ASSURED_WORKLOAD("assured_workload"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">atm</span></body></html> */
	ATM("atm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">attach_email</span></body></html> */
	ATTACH_EMAIL("attach_email"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">attach_file</span></body></html> */
	ATTACH_FILE("attach_file"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">attach_money</span></body></html> */
	ATTACH_MONEY("attach_money"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">attachment</span></body></html> */
	ATTACHMENT("attachment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">attractions</span></body></html> */
	ATTRACTIONS("attractions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">attribution</span></body></html> */
	ATTRIBUTION("attribution"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">audio_file</span></body></html> */
	AUDIO_FILE("audio_file"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">audiotrack</span></body></html> */
	AUDIOTRACK("audiotrack"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_awesome</span></body></html> */
	AUTO_AWESOME("auto_awesome"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_awesome_mosaic</span></body></html> */
	AUTO_AWESOME_MOSAIC("auto_awesome_mosaic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_awesome_motion</span></body></html> */
	AUTO_AWESOME_MOTION("auto_awesome_motion"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_delete</span></body></html> */
	AUTO_DELETE("auto_delete"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_fix_high</span></body></html> */
	AUTO_FIX_HIGH("auto_fix_high"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_fix_normal</span></body></html> */
	AUTO_FIX_NORMAL("auto_fix_normal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_fix_off</span></body></html> */
	AUTO_FIX_OFF("auto_fix_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_graph</span></body></html> */
	AUTO_GRAPH("auto_graph"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_mode</span></body></html> */
	AUTO_MODE("auto_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">auto_stories</span></body></html> */
	AUTO_STORIES("auto_stories"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">autofps_select</span></body></html> */
	AUTOFPS_SELECT("autofps_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">autorenew</span></body></html> */
	AUTORENEW("autorenew"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">av_timer</span></body></html> */
	AV_TIMER("av_timer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">baby_changing_station</span></body></html> */
	BABY_CHANGING_STATION("baby_changing_station"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">back_hand</span></body></html> */
	BACK_HAND("back_hand"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">backpack</span></body></html> */
	BACKPACK("backpack"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">backspace</span></body></html> */
	BACKSPACE("backspace"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">backup</span></body></html> */
	BACKUP("backup"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">backup_table</span></body></html> */
	BACKUP_TABLE("backup_table"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">badge</span></body></html> */
	BADGE("badge"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bakery_dining</span></body></html> */
	BAKERY_DINING("bakery_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">balance</span></body></html> */
	BALANCE("balance"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">balcony</span></body></html> */
	BALCONY("balcony"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ballot</span></body></html> */
	BALLOT("ballot"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bar_chart</span></body></html> */
	BAR_CHART("bar_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">barcode_reader</span></body></html> */
	BARCODE_READER("barcode_reader"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">batch_prediction</span></body></html> */
	BATCH_PREDICTION("batch_prediction"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bathroom</span></body></html> */
	BATHROOM("bathroom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bathtub</span></body></html> */
	BATHTUB("bathtub"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_0_bar</span></body></html> */
	BATTERY_0_BAR("battery_0_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_1_bar</span></body></html> */
	BATTERY_1_BAR("battery_1_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_2_bar</span></body></html> */
	BATTERY_2_BAR("battery_2_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_3_bar</span></body></html> */
	BATTERY_3_BAR("battery_3_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_4_bar</span></body></html> */
	BATTERY_4_BAR("battery_4_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_5_bar</span></body></html> */
	BATTERY_5_BAR("battery_5_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_6_bar</span></body></html> */
	BATTERY_6_BAR("battery_6_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_alert</span></body></html> */
	BATTERY_ALERT("battery_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_charging_full</span></body></html> */
	BATTERY_CHARGING_FULL("battery_charging_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_full</span></body></html> */
	BATTERY_FULL("battery_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_saver</span></body></html> */
	BATTERY_SAVER("battery_saver"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_std</span></body></html> */
	BATTERY_STD("battery_std"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">battery_unknown</span></body></html> */
	BATTERY_UNKNOWN("battery_unknown"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">beach_access</span></body></html> */
	BEACH_ACCESS("beach_access"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bed</span></body></html> */
	BED("bed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bedroom_baby</span></body></html> */
	BEDROOM_BABY("bedroom_baby"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bedroom_child</span></body></html> */
	BEDROOM_CHILD("bedroom_child"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bedroom_parent</span></body></html> */
	BEDROOM_PARENT("bedroom_parent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bedtime</span></body></html> */
	BEDTIME("bedtime"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bedtime_off</span></body></html> */
	BEDTIME_OFF("bedtime_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">beenhere</span></body></html> */
	BEENHERE("beenhere"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bento</span></body></html> */
	BENTO("bento"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bike_scooter</span></body></html> */
	BIKE_SCOOTER("bike_scooter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">biotech</span></body></html> */
	BIOTECH("biotech"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blender</span></body></html> */
	BLENDER("blender"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blind</span></body></html> */
	BLIND("blind"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blinds</span></body></html> */
	BLINDS("blinds"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blinds_closed</span></body></html> */
	BLINDS_CLOSED("blinds_closed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">block</span></body></html> */
	BLOCK("block"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">block_flipped</span></body></html> */
	BLOCK_FLIPPED("block_flipped"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bloodtype</span></body></html> */
	BLOODTYPE("bloodtype"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bluetooth</span></body></html> */
	BLUETOOTH("bluetooth"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bluetooth_audio</span></body></html> */
	BLUETOOTH_AUDIO("bluetooth_audio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bluetooth_connected</span></body></html> */
	BLUETOOTH_CONNECTED("bluetooth_connected"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bluetooth_disabled</span></body></html> */
	BLUETOOTH_DISABLED("bluetooth_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bluetooth_drive</span></body></html> */
	BLUETOOTH_DRIVE("bluetooth_drive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bluetooth_searching</span></body></html> */
	BLUETOOTH_SEARCHING("bluetooth_searching"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blur_circular</span></body></html> */
	BLUR_CIRCULAR("blur_circular"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blur_linear</span></body></html> */
	BLUR_LINEAR("blur_linear"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blur_off</span></body></html> */
	BLUR_OFF("blur_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">blur_on</span></body></html> */
	BLUR_ON("blur_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bolt</span></body></html> */
	BOLT("bolt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">book</span></body></html> */
	BOOK("book"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">book_online</span></body></html> */
	BOOK_ONLINE("book_online"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmark</span></body></html> */
	BOOKMARK("bookmark"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmark_add</span></body></html> */
	BOOKMARK_ADD("bookmark_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmark_added</span></body></html> */
	BOOKMARK_ADDED("bookmark_added"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmark_border</span></body></html> */
	BOOKMARK_BORDER("bookmark_border"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmark_outline</span></body></html> */
	BOOKMARK_OUTLINE("bookmark_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmark_remove</span></body></html> */
	BOOKMARK_REMOVE("bookmark_remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bookmarks</span></body></html> */
	BOOKMARKS("bookmarks"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_all</span></body></html> */
	BORDER_ALL("border_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_bottom</span></body></html> */
	BORDER_BOTTOM("border_bottom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_clear</span></body></html> */
	BORDER_CLEAR("border_clear"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_color</span></body></html> */
	BORDER_COLOR("border_color"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_horizontal</span></body></html> */
	BORDER_HORIZONTAL("border_horizontal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_inner</span></body></html> */
	BORDER_INNER("border_inner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_left</span></body></html> */
	BORDER_LEFT("border_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_outer</span></body></html> */
	BORDER_OUTER("border_outer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_right</span></body></html> */
	BORDER_RIGHT("border_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_style</span></body></html> */
	BORDER_STYLE("border_style"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_top</span></body></html> */
	BORDER_TOP("border_top"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">border_vertical</span></body></html> */
	BORDER_VERTICAL("border_vertical"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">boy</span></body></html> */
	BOY("boy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">branding_watermark</span></body></html> */
	BRANDING_WATERMARK("branding_watermark"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">breakfast_dining</span></body></html> */
	BREAKFAST_DINING("breakfast_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_1</span></body></html> */
	BRIGHTNESS_1("brightness_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_2</span></body></html> */
	BRIGHTNESS_2("brightness_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_3</span></body></html> */
	BRIGHTNESS_3("brightness_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_4</span></body></html> */
	BRIGHTNESS_4("brightness_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_5</span></body></html> */
	BRIGHTNESS_5("brightness_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_6</span></body></html> */
	BRIGHTNESS_6("brightness_6"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_7</span></body></html> */
	BRIGHTNESS_7("brightness_7"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_auto</span></body></html> */
	BRIGHTNESS_AUTO("brightness_auto"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_high</span></body></html> */
	BRIGHTNESS_HIGH("brightness_high"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_low</span></body></html> */
	BRIGHTNESS_LOW("brightness_low"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brightness_medium</span></body></html> */
	BRIGHTNESS_MEDIUM("brightness_medium"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">broadcast_on_home</span></body></html> */
	BROADCAST_ON_HOME("broadcast_on_home"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">broadcast_on_personal</span></body></html> */
	BROADCAST_ON_PERSONAL("broadcast_on_personal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">broken_image</span></body></html> */
	BROKEN_IMAGE("broken_image"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">browse_gallery</span></body></html> */
	BROWSE_GALLERY("browse_gallery"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">browser_not_supported</span></body></html> */
	BROWSER_NOT_SUPPORTED("browser_not_supported"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">browser_updated</span></body></html> */
	BROWSER_UPDATED("browser_updated"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brunch_dining</span></body></html> */
	BRUNCH_DINING("brunch_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">brush</span></body></html> */
	BRUSH("brush"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bubble_chart</span></body></html> */
	BUBBLE_CHART("bubble_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bug_report</span></body></html> */
	BUG_REPORT("bug_report"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">build</span></body></html> */
	BUILD("build"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">build_circle</span></body></html> */
	BUILD_CIRCLE("build_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bungalow</span></body></html> */
	BUNGALOW("bungalow"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">burst_mode</span></body></html> */
	BURST_MODE("burst_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">bus_alert</span></body></html> */
	BUS_ALERT("bus_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">business</span></body></html> */
	BUSINESS("business"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">business_center</span></body></html> */
	BUSINESS_CENTER("business_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cabin</span></body></html> */
	CABIN("cabin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cable</span></body></html> */
	CABLE("cable"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cached</span></body></html> */
	CACHED("cached"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cake</span></body></html> */
	CAKE("cake"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">calculate</span></body></html> */
	CALCULATE("calculate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">calendar_month</span></body></html> */
	CALENDAR_MONTH("calendar_month"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">calendar_today</span></body></html> */
	CALENDAR_TODAY("calendar_today"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">calendar_view_day</span></body></html> */
	CALENDAR_VIEW_DAY("calendar_view_day"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">calendar_view_month</span></body></html> */
	CALENDAR_VIEW_MONTH("calendar_view_month"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">calendar_view_week</span></body></html> */
	CALENDAR_VIEW_WEEK("calendar_view_week"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call</span></body></html> */
	CALL("call"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_end</span></body></html> */
	CALL_END("call_end"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_made</span></body></html> */
	CALL_MADE("call_made"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_merge</span></body></html> */
	CALL_MERGE("call_merge"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_missed</span></body></html> */
	CALL_MISSED("call_missed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_missed_outgoing</span></body></html> */
	CALL_MISSED_OUTGOING("call_missed_outgoing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_received</span></body></html> */
	CALL_RECEIVED("call_received"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_split</span></body></html> */
	CALL_SPLIT("call_split"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">call_to_action</span></body></html> */
	CALL_TO_ACTION("call_to_action"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera</span></body></html> */
	CAMERA("camera"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_alt</span></body></html> */
	CAMERA_ALT("camera_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_enhance</span></body></html> */
	CAMERA_ENHANCE("camera_enhance"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_front</span></body></html> */
	CAMERA_FRONT("camera_front"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_indoor</span></body></html> */
	CAMERA_INDOOR("camera_indoor"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_outdoor</span></body></html> */
	CAMERA_OUTDOOR("camera_outdoor"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_rear</span></body></html> */
	CAMERA_REAR("camera_rear"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">camera_roll</span></body></html> */
	CAMERA_ROLL("camera_roll"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cameraswitch</span></body></html> */
	CAMERASWITCH("cameraswitch"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">campaign</span></body></html> */
	CAMPAIGN("campaign"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cancel</span></body></html> */
	CANCEL("cancel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cancel_presentation</span></body></html> */
	CANCEL_PRESENTATION("cancel_presentation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cancel_schedule_send</span></body></html> */
	CANCEL_SCHEDULE_SEND("cancel_schedule_send"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">candlestick_chart</span></body></html> */
	CANDLESTICK_CHART("candlestick_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">car_crash</span></body></html> */
	CAR_CRASH("car_crash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">car_rental</span></body></html> */
	CAR_RENTAL("car_rental"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">car_repair</span></body></html> */
	CAR_REPAIR("car_repair"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">card_giftcard</span></body></html> */
	CARD_GIFTCARD("card_giftcard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">card_membership</span></body></html> */
	CARD_MEMBERSHIP("card_membership"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">card_travel</span></body></html> */
	CARD_TRAVEL("card_travel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">carpenter</span></body></html> */
	CARPENTER("carpenter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cases</span></body></html> */
	CASES("cases"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">casino</span></body></html> */
	CASINO("casino"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cast</span></body></html> */
	CAST("cast"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cast_connected</span></body></html> */
	CAST_CONNECTED("cast_connected"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cast_for_education</span></body></html> */
	CAST_FOR_EDUCATION("cast_for_education"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">castle</span></body></html> */
	CASTLE("castle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">catching_pokemon</span></body></html> */
	CATCHING_POKEMON("catching_pokemon"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">category</span></body></html> */
	CATEGORY("category"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">celebration</span></body></html> */
	CELEBRATION("celebration"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cell_tower</span></body></html> */
	CELL_TOWER("cell_tower"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cell_wifi</span></body></html> */
	CELL_WIFI("cell_wifi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">center_focus_strong</span></body></html> */
	CENTER_FOCUS_STRONG("center_focus_strong"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">center_focus_weak</span></body></html> */
	CENTER_FOCUS_WEAK("center_focus_weak"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chair</span></body></html> */
	CHAIR("chair"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chair_alt</span></body></html> */
	CHAIR_ALT("chair_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chalet</span></body></html> */
	CHALET("chalet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">change_circle</span></body></html> */
	CHANGE_CIRCLE("change_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">change_history</span></body></html> */
	CHANGE_HISTORY("change_history"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">charging_station</span></body></html> */
	CHARGING_STATION("charging_station"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chat</span></body></html> */
	CHAT("chat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chat_bubble</span></body></html> */
	CHAT_BUBBLE("chat_bubble"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chat_bubble_outline</span></body></html> */
	CHAT_BUBBLE_OUTLINE("chat_bubble_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">check</span></body></html> */
	CHECK("check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">check_box</span></body></html> */
	CHECK_BOX("check_box"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">check_box_outline_blank</span></body></html> */
	CHECK_BOX_OUTLINE_BLANK("check_box_outline_blank"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">check_circle</span></body></html> */
	CHECK_CIRCLE("check_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">check_circle_outline</span></body></html> */
	CHECK_CIRCLE_OUTLINE("check_circle_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">checklist</span></body></html> */
	CHECKLIST("checklist"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">checklist_rtl</span></body></html> */
	CHECKLIST_RTL("checklist_rtl"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">checkroom</span></body></html> */
	CHECKROOM("checkroom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chevron_left</span></body></html> */
	CHEVRON_LEFT("chevron_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chevron_right</span></body></html> */
	CHEVRON_RIGHT("chevron_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">child_care</span></body></html> */
	CHILD_CARE("child_care"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">child_friendly</span></body></html> */
	CHILD_FRIENDLY("child_friendly"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">chrome_reader_mode</span></body></html> */
	CHROME_READER_MODE("chrome_reader_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">church</span></body></html> */
	CHURCH("church"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">circle</span></body></html> */
	CIRCLE("circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">circle_notifications</span></body></html> */
	CIRCLE_NOTIFICATIONS("circle_notifications"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">class</span></body></html> */
	CLASS("class"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">clean_hands</span></body></html> */
	CLEAN_HANDS("clean_hands"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cleaning_services</span></body></html> */
	CLEANING_SERVICES("cleaning_services"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">clear</span></body></html> */
	CLEAR("clear"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">clear_all</span></body></html> */
	CLEAR_ALL("clear_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">close</span></body></html> */
	CLOSE("close"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">close_fullscreen</span></body></html> */
	CLOSE_FULLSCREEN("close_fullscreen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">closed_caption</span></body></html> */
	CLOSED_CAPTION("closed_caption"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">closed_caption_disabled</span></body></html> */
	CLOSED_CAPTION_DISABLED("closed_caption_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">closed_caption_off</span></body></html> */
	CLOSED_CAPTION_OFF("closed_caption_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud</span></body></html> */
	CLOUD("cloud"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_circle</span></body></html> */
	CLOUD_CIRCLE("cloud_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_done</span></body></html> */
	CLOUD_DONE("cloud_done"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_download</span></body></html> */
	CLOUD_DOWNLOAD("cloud_download"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_off</span></body></html> */
	CLOUD_OFF("cloud_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_queue</span></body></html> */
	CLOUD_QUEUE("cloud_queue"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_sync</span></body></html> */
	CLOUD_SYNC("cloud_sync"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloud_upload</span></body></html> */
	CLOUD_UPLOAD("cloud_upload"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cloudy_snowing</span></body></html> */
	CLOUDY_SNOWING("cloudy_snowing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">co2</span></body></html> */
	CO2("co2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">co_present</span></body></html> */
	CO_PRESENT("co_present"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">code</span></body></html> */
	CODE("code"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">code_off</span></body></html> */
	CODE_OFF("code_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">coffee</span></body></html> */
	COFFEE("coffee"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">coffee_maker</span></body></html> */
	COFFEE_MAKER("coffee_maker"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">collections</span></body></html> */
	COLLECTIONS("collections"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">collections_bookmark</span></body></html> */
	COLLECTIONS_BOOKMARK("collections_bookmark"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">color_lens</span></body></html> */
	COLOR_LENS("color_lens"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">colorize</span></body></html> */
	COLORIZE("colorize"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">comment</span></body></html> */
	COMMENT("comment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">comment_bank</span></body></html> */
	COMMENT_BANK("comment_bank"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">comments_disabled</span></body></html> */
	COMMENTS_DISABLED("comments_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">commit</span></body></html> */
	COMMIT("commit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">commute</span></body></html> */
	COMMUTE("commute"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">compare</span></body></html> */
	COMPARE("compare"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">compare_arrows</span></body></html> */
	COMPARE_ARROWS("compare_arrows"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">compass_calibration</span></body></html> */
	COMPASS_CALIBRATION("compass_calibration"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">compost</span></body></html> */
	COMPOST("compost"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">compress</span></body></html> */
	COMPRESS("compress"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">computer</span></body></html> */
	COMPUTER("computer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">confirmation_num</span></body></html> */
	CONFIRMATION_NUM("confirmation_num"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">confirmation_number</span></body></html> */
	CONFIRMATION_NUMBER("confirmation_number"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">connect_without_contact</span></body></html> */
	CONNECT_WITHOUT_CONTACT("connect_without_contact"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">connected_tv</span></body></html> */
	CONNECTED_TV("connected_tv"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">connecting_airports</span></body></html> */
	CONNECTING_AIRPORTS("connecting_airports"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">construction</span></body></html> */
	CONSTRUCTION("construction"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contact_emergency</span></body></html> */
	CONTACT_EMERGENCY("contact_emergency"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contact_mail</span></body></html> */
	CONTACT_MAIL("contact_mail"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contact_page</span></body></html> */
	CONTACT_PAGE("contact_page"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contact_phone</span></body></html> */
	CONTACT_PHONE("contact_phone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contact_support</span></body></html> */
	CONTACT_SUPPORT("contact_support"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contactless</span></body></html> */
	CONTACTLESS("contactless"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contacts</span></body></html> */
	CONTACTS("contacts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">content_copy</span></body></html> */
	CONTENT_COPY("content_copy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">content_cut</span></body></html> */
	CONTENT_CUT("content_cut"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">content_paste</span></body></html> */
	CONTENT_PASTE("content_paste"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">content_paste_go</span></body></html> */
	CONTENT_PASTE_GO("content_paste_go"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">content_paste_off</span></body></html> */
	CONTENT_PASTE_OFF("content_paste_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">content_paste_search</span></body></html> */
	CONTENT_PASTE_SEARCH("content_paste_search"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">contrast</span></body></html> */
	CONTRAST("contrast"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">control_camera</span></body></html> */
	CONTROL_CAMERA("control_camera"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">control_point</span></body></html> */
	CONTROL_POINT("control_point"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">control_point_duplicate</span></body></html> */
	CONTROL_POINT_DUPLICATE("control_point_duplicate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">conveyor_belt</span></body></html> */
	CONVEYOR_BELT("conveyor_belt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cookie</span></body></html> */
	COOKIE("cookie"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">copy_all</span></body></html> */
	COPY_ALL("copy_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">copyright</span></body></html> */
	COPYRIGHT("copyright"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">coronavirus</span></body></html> */
	CORONAVIRUS("coronavirus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">corporate_fare</span></body></html> */
	CORPORATE_FARE("corporate_fare"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cottage</span></body></html> */
	COTTAGE("cottage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">countertops</span></body></html> */
	COUNTERTOPS("countertops"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">create</span></body></html> */
	CREATE("create"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">create_new_folder</span></body></html> */
	CREATE_NEW_FOLDER("create_new_folder"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">credit_card</span></body></html> */
	CREDIT_CARD("credit_card"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">credit_card_off</span></body></html> */
	CREDIT_CARD_OFF("credit_card_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">credit_score</span></body></html> */
	CREDIT_SCORE("credit_score"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crib</span></body></html> */
	CRIB("crib"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crisis_alert</span></body></html> */
	CRISIS_ALERT("crisis_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop</span></body></html> */
	CROP("crop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_16_9</span></body></html> */
	CROP_16_9("crop_16_9"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_3_2</span></body></html> */
	CROP_3_2("crop_3_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_5_4</span></body></html> */
	CROP_5_4("crop_5_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_7_5</span></body></html> */
	CROP_7_5("crop_7_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_din</span></body></html> */
	CROP_DIN("crop_din"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_free</span></body></html> */
	CROP_FREE("crop_free"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_landscape</span></body></html> */
	CROP_LANDSCAPE("crop_landscape"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_original</span></body></html> */
	CROP_ORIGINAL("crop_original"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_portrait</span></body></html> */
	CROP_PORTRAIT("crop_portrait"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_rotate</span></body></html> */
	CROP_ROTATE("crop_rotate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">crop_square</span></body></html> */
	CROP_SQUARE("crop_square"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cruelty_free</span></body></html> */
	CRUELTY_FREE("cruelty_free"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">css</span></body></html> */
	CSS("css"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_bitcoin</span></body></html> */
	CURRENCY_BITCOIN("currency_bitcoin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_exchange</span></body></html> */
	CURRENCY_EXCHANGE("currency_exchange"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_franc</span></body></html> */
	CURRENCY_FRANC("currency_franc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_lira</span></body></html> */
	CURRENCY_LIRA("currency_lira"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_pound</span></body></html> */
	CURRENCY_POUND("currency_pound"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_ruble</span></body></html> */
	CURRENCY_RUBLE("currency_ruble"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_rupee</span></body></html> */
	CURRENCY_RUPEE("currency_rupee"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_yen</span></body></html> */
	CURRENCY_YEN("currency_yen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">currency_yuan</span></body></html> */
	CURRENCY_YUAN("currency_yuan"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">curtains</span></body></html> */
	CURTAINS("curtains"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">curtains_closed</span></body></html> */
	CURTAINS_CLOSED("curtains_closed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">cyclone</span></body></html> */
	CYCLONE("cyclone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dangerous</span></body></html> */
	DANGEROUS("dangerous"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dark_mode</span></body></html> */
	DARK_MODE("dark_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dashboard</span></body></html> */
	DASHBOARD("dashboard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dashboard_customize</span></body></html> */
	DASHBOARD_CUSTOMIZE("dashboard_customize"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_array</span></body></html> */
	DATA_ARRAY("data_array"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_exploration</span></body></html> */
	DATA_EXPLORATION("data_exploration"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_object</span></body></html> */
	DATA_OBJECT("data_object"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_saver_off</span></body></html> */
	DATA_SAVER_OFF("data_saver_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_saver_on</span></body></html> */
	DATA_SAVER_ON("data_saver_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_thresholding</span></body></html> */
	DATA_THRESHOLDING("data_thresholding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">data_usage</span></body></html> */
	DATA_USAGE("data_usage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dataset</span></body></html> */
	DATASET("dataset"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dataset_linked</span></body></html> */
	DATASET_LINKED("dataset_linked"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">date_range</span></body></html> */
	DATE_RANGE("date_range"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">deblur</span></body></html> */
	DEBLUR("deblur"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">deck</span></body></html> */
	DECK("deck"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dehaze</span></body></html> */
	DEHAZE("dehaze"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">delete</span></body></html> */
	DELETE("delete"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">delete_forever</span></body></html> */
	DELETE_FOREVER("delete_forever"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">delete_outline</span></body></html> */
	DELETE_OUTLINE("delete_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">delete_sweep</span></body></html> */
	DELETE_SWEEP("delete_sweep"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">delivery_dining</span></body></html> */
	DELIVERY_DINING("delivery_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">density_large</span></body></html> */
	DENSITY_LARGE("density_large"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">density_medium</span></body></html> */
	DENSITY_MEDIUM("density_medium"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">density_small</span></body></html> */
	DENSITY_SMALL("density_small"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">departure_board</span></body></html> */
	DEPARTURE_BOARD("departure_board"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">description</span></body></html> */
	DESCRIPTION("description"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">deselect</span></body></html> */
	DESELECT("deselect"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">design_services</span></body></html> */
	DESIGN_SERVICES("design_services"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">desk</span></body></html> */
	DESK("desk"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">desktop_access_disabled</span></body></html> */
	DESKTOP_ACCESS_DISABLED("desktop_access_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">desktop_mac</span></body></html> */
	DESKTOP_MAC("desktop_mac"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">desktop_windows</span></body></html> */
	DESKTOP_WINDOWS("desktop_windows"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">details</span></body></html> */
	DETAILS("details"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">developer_board</span></body></html> */
	DEVELOPER_BOARD("developer_board"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">developer_board_off</span></body></html> */
	DEVELOPER_BOARD_OFF("developer_board_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">developer_mode</span></body></html> */
	DEVELOPER_MODE("developer_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">device_hub</span></body></html> */
	DEVICE_HUB("device_hub"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">device_thermostat</span></body></html> */
	DEVICE_THERMOSTAT("device_thermostat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">device_unknown</span></body></html> */
	DEVICE_UNKNOWN("device_unknown"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">devices</span></body></html> */
	DEVICES("devices"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">devices_fold</span></body></html> */
	DEVICES_FOLD("devices_fold"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">devices_other</span></body></html> */
	DEVICES_OTHER("devices_other"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dew_point</span></body></html> */
	DEW_POINT("dew_point"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dialer_sip</span></body></html> */
	DIALER_SIP("dialer_sip"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dialpad</span></body></html> */
	DIALPAD("dialpad"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">diamond</span></body></html> */
	DIAMOND("diamond"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">difference</span></body></html> */
	DIFFERENCE("difference"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dining</span></body></html> */
	DINING("dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dinner_dining</span></body></html> */
	DINNER_DINING("dinner_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions</span></body></html> */
	DIRECTIONS("directions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_bike</span></body></html> */
	DIRECTIONS_BIKE("directions_bike"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_boat</span></body></html> */
	DIRECTIONS_BOAT("directions_boat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_boat_filled</span></body></html> */
	DIRECTIONS_BOAT_FILLED("directions_boat_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_bus</span></body></html> */
	DIRECTIONS_BUS("directions_bus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_bus_filled</span></body></html> */
	DIRECTIONS_BUS_FILLED("directions_bus_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_car</span></body></html> */
	DIRECTIONS_CAR("directions_car"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_car_filled</span></body></html> */
	DIRECTIONS_CAR_FILLED("directions_car_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_ferry</span></body></html> */
	DIRECTIONS_FERRY("directions_ferry"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_off</span></body></html> */
	DIRECTIONS_OFF("directions_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_railway</span></body></html> */
	DIRECTIONS_RAILWAY("directions_railway"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_railway_filled</span></body></html> */
	DIRECTIONS_RAILWAY_FILLED("directions_railway_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_run</span></body></html> */
	DIRECTIONS_RUN("directions_run"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_subway</span></body></html> */
	DIRECTIONS_SUBWAY("directions_subway"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_subway_filled</span></body></html> */
	DIRECTIONS_SUBWAY_FILLED("directions_subway_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_train</span></body></html> */
	DIRECTIONS_TRAIN("directions_train"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_transit</span></body></html> */
	DIRECTIONS_TRANSIT("directions_transit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_transit_filled</span></body></html> */
	DIRECTIONS_TRANSIT_FILLED("directions_transit_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">directions_walk</span></body></html> */
	DIRECTIONS_WALK("directions_walk"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dirty_lens</span></body></html> */
	DIRTY_LENS("dirty_lens"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">disabled_by_default</span></body></html> */
	DISABLED_BY_DEFAULT("disabled_by_default"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">disabled_visible</span></body></html> */
	DISABLED_VISIBLE("disabled_visible"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">disc_full</span></body></html> */
	DISC_FULL("disc_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">discord</span></body></html> */
	DISCORD("discord"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">discount</span></body></html> */
	DISCOUNT("discount"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">display_settings</span></body></html> */
	DISPLAY_SETTINGS("display_settings"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">diversity_1</span></body></html> */
	DIVERSITY_1("diversity_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">diversity_2</span></body></html> */
	DIVERSITY_2("diversity_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">diversity_3</span></body></html> */
	DIVERSITY_3("diversity_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dnd_forwardslash</span></body></html> */
	DND_FORWARDSLASH("dnd_forwardslash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dns</span></body></html> */
	DNS("dns"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_disturb</span></body></html> */
	DO_DISTURB("do_disturb"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_disturb_alt</span></body></html> */
	DO_DISTURB_ALT("do_disturb_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_disturb_off</span></body></html> */
	DO_DISTURB_OFF("do_disturb_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_disturb_on</span></body></html> */
	DO_DISTURB_ON("do_disturb_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_disturb</span></body></html> */
	DO_NOT_DISTURB("do_not_disturb"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_disturb_alt</span></body></html> */
	DO_NOT_DISTURB_ALT("do_not_disturb_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_disturb_off</span></body></html> */
	DO_NOT_DISTURB_OFF("do_not_disturb_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_disturb_on</span></body></html> */
	DO_NOT_DISTURB_ON("do_not_disturb_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_disturb_on_total_silence</span></body></html> */
	DO_NOT_DISTURB_ON_TOTAL_SILENCE("do_not_disturb_on_total_silence"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_step</span></body></html> */
	DO_NOT_STEP("do_not_step"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">do_not_touch</span></body></html> */
	DO_NOT_TOUCH("do_not_touch"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dock</span></body></html> */
	DOCK("dock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">document_scanner</span></body></html> */
	DOCUMENT_SCANNER("document_scanner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">domain</span></body></html> */
	DOMAIN("domain"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">domain_add</span></body></html> */
	DOMAIN_ADD("domain_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">domain_disabled</span></body></html> */
	DOMAIN_DISABLED("domain_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">domain_verification</span></body></html> */
	DOMAIN_VERIFICATION("domain_verification"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">done</span></body></html> */
	DONE("done"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">done_all</span></body></html> */
	DONE_ALL("done_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">done_outline</span></body></html> */
	DONE_OUTLINE("done_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">donut_large</span></body></html> */
	DONUT_LARGE("donut_large"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">donut_small</span></body></html> */
	DONUT_SMALL("donut_small"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">door_back</span></body></html> */
	DOOR_BACK("door_back"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">door_front</span></body></html> */
	DOOR_FRONT("door_front"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">door_sliding</span></body></html> */
	DOOR_SLIDING("door_sliding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">doorbell</span></body></html> */
	DOORBELL("doorbell"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">double_arrow</span></body></html> */
	DOUBLE_ARROW("double_arrow"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">downhill_skiing</span></body></html> */
	DOWNHILL_SKIING("downhill_skiing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">download</span></body></html> */
	DOWNLOAD("download"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">download_done</span></body></html> */
	DOWNLOAD_DONE("download_done"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">download_for_offline</span></body></html> */
	DOWNLOAD_FOR_OFFLINE("download_for_offline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">downloading</span></body></html> */
	DOWNLOADING("downloading"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drafts</span></body></html> */
	DRAFTS("drafts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drag_handle</span></body></html> */
	DRAG_HANDLE("drag_handle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drag_indicator</span></body></html> */
	DRAG_INDICATOR("drag_indicator"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">draw</span></body></html> */
	DRAW("draw"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drive_eta</span></body></html> */
	DRIVE_ETA("drive_eta"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drive_file_move</span></body></html> */
	DRIVE_FILE_MOVE("drive_file_move"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drive_file_move_outline</span></body></html> */
	DRIVE_FILE_MOVE_OUTLINE("drive_file_move_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drive_file_move_rtl</span></body></html> */
	DRIVE_FILE_MOVE_RTL("drive_file_move_rtl"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drive_file_rename_outline</span></body></html> */
	DRIVE_FILE_RENAME_OUTLINE("drive_file_rename_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">drive_folder_upload</span></body></html> */
	DRIVE_FOLDER_UPLOAD("drive_folder_upload"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dry</span></body></html> */
	DRY("dry"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dry_cleaning</span></body></html> */
	DRY_CLEANING("dry_cleaning"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">duo</span></body></html> */
	DUO("duo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dvr</span></body></html> */
	DVR("dvr"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dynamic_feed</span></body></html> */
	DYNAMIC_FEED("dynamic_feed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">dynamic_form</span></body></html> */
	DYNAMIC_FORM("dynamic_form"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">e_mobiledata</span></body></html> */
	E_MOBILEDATA("e_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">earbuds</span></body></html> */
	EARBUDS("earbuds"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">earbuds_battery</span></body></html> */
	EARBUDS_BATTERY("earbuds_battery"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">east</span></body></html> */
	EAST("east"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">eco</span></body></html> */
	ECO("eco"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edgesensor_high</span></body></html> */
	EDGESENSOR_HIGH("edgesensor_high"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edgesensor_low</span></body></html> */
	EDGESENSOR_LOW("edgesensor_low"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit</span></body></html> */
	EDIT("edit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_attributes</span></body></html> */
	EDIT_ATTRIBUTES("edit_attributes"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_calendar</span></body></html> */
	EDIT_CALENDAR("edit_calendar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_document</span></body></html> */
	EDIT_DOCUMENT("edit_document"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_location</span></body></html> */
	EDIT_LOCATION("edit_location"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_location_alt</span></body></html> */
	EDIT_LOCATION_ALT("edit_location_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_note</span></body></html> */
	EDIT_NOTE("edit_note"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_notifications</span></body></html> */
	EDIT_NOTIFICATIONS("edit_notifications"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_off</span></body></html> */
	EDIT_OFF("edit_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_road</span></body></html> */
	EDIT_ROAD("edit_road"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">edit_square</span></body></html> */
	EDIT_SQUARE("edit_square"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">egg</span></body></html> */
	EGG("egg"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">egg_alt</span></body></html> */
	EGG_ALT("egg_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">eject</span></body></html> */
	EJECT("eject"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">elderly</span></body></html> */
	ELDERLY("elderly"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">elderly_woman</span></body></html> */
	ELDERLY_WOMAN("elderly_woman"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_bike</span></body></html> */
	ELECTRIC_BIKE("electric_bike"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_bolt</span></body></html> */
	ELECTRIC_BOLT("electric_bolt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_car</span></body></html> */
	ELECTRIC_CAR("electric_car"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_meter</span></body></html> */
	ELECTRIC_METER("electric_meter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_moped</span></body></html> */
	ELECTRIC_MOPED("electric_moped"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_rickshaw</span></body></html> */
	ELECTRIC_RICKSHAW("electric_rickshaw"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electric_scooter</span></body></html> */
	ELECTRIC_SCOOTER("electric_scooter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">electrical_services</span></body></html> */
	ELECTRICAL_SERVICES("electrical_services"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">elevator</span></body></html> */
	ELEVATOR("elevator"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">email</span></body></html> */
	EMAIL("email"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emergency</span></body></html> */
	EMERGENCY("emergency"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emergency_recording</span></body></html> */
	EMERGENCY_RECORDING("emergency_recording"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emergency_share</span></body></html> */
	EMERGENCY_SHARE("emergency_share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_emotions</span></body></html> */
	EMOJI_EMOTIONS("emoji_emotions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_events</span></body></html> */
	EMOJI_EVENTS("emoji_events"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_flags</span></body></html> */
	EMOJI_FLAGS("emoji_flags"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_food_beverage</span></body></html> */
	EMOJI_FOOD_BEVERAGE("emoji_food_beverage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_nature</span></body></html> */
	EMOJI_NATURE("emoji_nature"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_objects</span></body></html> */
	EMOJI_OBJECTS("emoji_objects"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_people</span></body></html> */
	EMOJI_PEOPLE("emoji_people"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_symbols</span></body></html> */
	EMOJI_SYMBOLS("emoji_symbols"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">emoji_transportation</span></body></html> */
	EMOJI_TRANSPORTATION("emoji_transportation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">energy_savings_leaf</span></body></html> */
	ENERGY_SAVINGS_LEAF("energy_savings_leaf"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">engineering</span></body></html> */
	ENGINEERING("engineering"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">enhance_photo_translate</span></body></html> */
	ENHANCE_PHOTO_TRANSLATE("enhance_photo_translate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">enhanced_encryption</span></body></html> */
	ENHANCED_ENCRYPTION("enhanced_encryption"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">equalizer</span></body></html> */
	EQUALIZER("equalizer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">error</span></body></html> */
	ERROR("error"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">error_outline</span></body></html> */
	ERROR_OUTLINE("error_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">escalator</span></body></html> */
	ESCALATOR("escalator"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">escalator_warning</span></body></html> */
	ESCALATOR_WARNING("escalator_warning"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">euro</span></body></html> */
	EURO("euro"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">euro_symbol</span></body></html> */
	EURO_SYMBOL("euro_symbol"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ev_station</span></body></html> */
	EV_STATION("ev_station"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">event</span></body></html> */
	EVENT("event"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">event_available</span></body></html> */
	EVENT_AVAILABLE("event_available"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">event_busy</span></body></html> */
	EVENT_BUSY("event_busy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">event_note</span></body></html> */
	EVENT_NOTE("event_note"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">event_repeat</span></body></html> */
	EVENT_REPEAT("event_repeat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">event_seat</span></body></html> */
	EVENT_SEAT("event_seat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exit_to_app</span></body></html> */
	EXIT_TO_APP("exit_to_app"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">expand</span></body></html> */
	EXPAND("expand"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">expand_circle_down</span></body></html> */
	EXPAND_CIRCLE_DOWN("expand_circle_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">expand_less</span></body></html> */
	EXPAND_LESS("expand_less"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">expand_more</span></body></html> */
	EXPAND_MORE("expand_more"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">explicit</span></body></html> */
	EXPLICIT("explicit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">explore</span></body></html> */
	EXPLORE("explore"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">explore_off</span></body></html> */
	EXPLORE_OFF("explore_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure</span></body></html> */
	EXPOSURE("exposure"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_minus_1</span></body></html> */
	EXPOSURE_MINUS_1("exposure_minus_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_minus_2</span></body></html> */
	EXPOSURE_MINUS_2("exposure_minus_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_neg_1</span></body></html> */
	EXPOSURE_NEG_1("exposure_neg_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_neg_2</span></body></html> */
	EXPOSURE_NEG_2("exposure_neg_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_plus_1</span></body></html> */
	EXPOSURE_PLUS_1("exposure_plus_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_plus_2</span></body></html> */
	EXPOSURE_PLUS_2("exposure_plus_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">exposure_zero</span></body></html> */
	EXPOSURE_ZERO("exposure_zero"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">extension</span></body></html> */
	EXTENSION("extension"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">extension_off</span></body></html> */
	EXTENSION_OFF("extension_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face</span></body></html> */
	FACE("face"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_2</span></body></html> */
	FACE_2("face_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_3</span></body></html> */
	FACE_3("face_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_4</span></body></html> */
	FACE_4("face_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_5</span></body></html> */
	FACE_5("face_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_6</span></body></html> */
	FACE_6("face_6"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_retouching_natural</span></body></html> */
	FACE_RETOUCHING_NATURAL("face_retouching_natural"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">face_retouching_off</span></body></html> */
	FACE_RETOUCHING_OFF("face_retouching_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">facebook</span></body></html> */
	FACEBOOK("facebook"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fact_check</span></body></html> */
	FACT_CHECK("fact_check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">factory</span></body></html> */
	FACTORY("factory"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">family_restroom</span></body></html> */
	FAMILY_RESTROOM("family_restroom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fast_forward</span></body></html> */
	FAST_FORWARD("fast_forward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fast_rewind</span></body></html> */
	FAST_REWIND("fast_rewind"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fastfood</span></body></html> */
	FASTFOOD("fastfood"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">favorite</span></body></html> */
	FAVORITE("favorite"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">favorite_border</span></body></html> */
	FAVORITE_BORDER("favorite_border"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">favorite_outline</span></body></html> */
	FAVORITE_OUTLINE("favorite_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fax</span></body></html> */
	FAX("fax"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">featured_play_list</span></body></html> */
	FEATURED_PLAY_LIST("featured_play_list"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">featured_video</span></body></html> */
	FEATURED_VIDEO("featured_video"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">feed</span></body></html> */
	FEED("feed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">feedback</span></body></html> */
	FEEDBACK("feedback"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">female</span></body></html> */
	FEMALE("female"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fence</span></body></html> */
	FENCE("fence"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">festival</span></body></html> */
	FESTIVAL("festival"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fiber_dvr</span></body></html> */
	FIBER_DVR("fiber_dvr"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fiber_manual_record</span></body></html> */
	FIBER_MANUAL_RECORD("fiber_manual_record"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fiber_new</span></body></html> */
	FIBER_NEW("fiber_new"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fiber_pin</span></body></html> */
	FIBER_PIN("fiber_pin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fiber_smart_record</span></body></html> */
	FIBER_SMART_RECORD("fiber_smart_record"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_copy</span></body></html> */
	FILE_COPY("file_copy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_download</span></body></html> */
	FILE_DOWNLOAD("file_download"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_download_done</span></body></html> */
	FILE_DOWNLOAD_DONE("file_download_done"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_download_off</span></body></html> */
	FILE_DOWNLOAD_OFF("file_download_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_open</span></body></html> */
	FILE_OPEN("file_open"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_present</span></body></html> */
	FILE_PRESENT("file_present"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_upload</span></body></html> */
	FILE_UPLOAD("file_upload"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">file_upload_off</span></body></html> */
	FILE_UPLOAD_OFF("file_upload_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter</span></body></html> */
	FILTER("filter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_1</span></body></html> */
	FILTER_1("filter_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_2</span></body></html> */
	FILTER_2("filter_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_3</span></body></html> */
	FILTER_3("filter_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_4</span></body></html> */
	FILTER_4("filter_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_5</span></body></html> */
	FILTER_5("filter_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_6</span></body></html> */
	FILTER_6("filter_6"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_7</span></body></html> */
	FILTER_7("filter_7"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_8</span></body></html> */
	FILTER_8("filter_8"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_9</span></body></html> */
	FILTER_9("filter_9"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_9_plus</span></body></html> */
	FILTER_9_PLUS("filter_9_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_alt</span></body></html> */
	FILTER_ALT("filter_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_alt_off</span></body></html> */
	FILTER_ALT_OFF("filter_alt_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_b_and_w</span></body></html> */
	FILTER_B_AND_W("filter_b_and_w"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_center_focus</span></body></html> */
	FILTER_CENTER_FOCUS("filter_center_focus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_drama</span></body></html> */
	FILTER_DRAMA("filter_drama"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_frames</span></body></html> */
	FILTER_FRAMES("filter_frames"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_hdr</span></body></html> */
	FILTER_HDR("filter_hdr"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_list</span></body></html> */
	FILTER_LIST("filter_list"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_list_alt</span></body></html> */
	FILTER_LIST_ALT("filter_list_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_list_off</span></body></html> */
	FILTER_LIST_OFF("filter_list_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_none</span></body></html> */
	FILTER_NONE("filter_none"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_tilt_shift</span></body></html> */
	FILTER_TILT_SHIFT("filter_tilt_shift"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">filter_vintage</span></body></html> */
	FILTER_VINTAGE("filter_vintage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">find_in_page</span></body></html> */
	FIND_IN_PAGE("find_in_page"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">find_replace</span></body></html> */
	FIND_REPLACE("find_replace"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fingerprint</span></body></html> */
	FINGERPRINT("fingerprint"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fire_extinguisher</span></body></html> */
	FIRE_EXTINGUISHER("fire_extinguisher"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fire_hydrant</span></body></html> */
	FIRE_HYDRANT("fire_hydrant"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fire_hydrant_alt</span></body></html> */
	FIRE_HYDRANT_ALT("fire_hydrant_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fire_truck</span></body></html> */
	FIRE_TRUCK("fire_truck"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fireplace</span></body></html> */
	FIREPLACE("fireplace"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">first_page</span></body></html> */
	FIRST_PAGE("first_page"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fit_screen</span></body></html> */
	FIT_SCREEN("fit_screen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fitbit</span></body></html> */
	FITBIT("fitbit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fitness_center</span></body></html> */
	FITNESS_CENTER("fitness_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flag</span></body></html> */
	FLAG("flag"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flag_circle</span></body></html> */
	FLAG_CIRCLE("flag_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flaky</span></body></html> */
	FLAKY("flaky"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flare</span></body></html> */
	FLARE("flare"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flash_auto</span></body></html> */
	FLASH_AUTO("flash_auto"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flash_off</span></body></html> */
	FLASH_OFF("flash_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flash_on</span></body></html> */
	FLASH_ON("flash_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flashlight_off</span></body></html> */
	FLASHLIGHT_OFF("flashlight_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flashlight_on</span></body></html> */
	FLASHLIGHT_ON("flashlight_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flatware</span></body></html> */
	FLATWARE("flatware"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flight</span></body></html> */
	FLIGHT("flight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flight_class</span></body></html> */
	FLIGHT_CLASS("flight_class"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flight_land</span></body></html> */
	FLIGHT_LAND("flight_land"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flight_takeoff</span></body></html> */
	FLIGHT_TAKEOFF("flight_takeoff"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flip</span></body></html> */
	FLIP("flip"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flip_camera_android</span></body></html> */
	FLIP_CAMERA_ANDROID("flip_camera_android"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flip_camera_ios</span></body></html> */
	FLIP_CAMERA_IOS("flip_camera_ios"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flip_to_back</span></body></html> */
	FLIP_TO_BACK("flip_to_back"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flip_to_front</span></body></html> */
	FLIP_TO_FRONT("flip_to_front"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flood</span></body></html> */
	FLOOD("flood"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flourescent</span></body></html> */
	FLOURESCENT("flourescent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fluorescent</span></body></html> */
	FLUORESCENT("fluorescent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">flutter_dash</span></body></html> */
	FLUTTER_DASH("flutter_dash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fmd_bad</span></body></html> */
	FMD_BAD("fmd_bad"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fmd_good</span></body></html> */
	FMD_GOOD("fmd_good"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">foggy</span></body></html> */
	FOGGY("foggy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder</span></body></html> */
	FOLDER("folder"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_copy</span></body></html> */
	FOLDER_COPY("folder_copy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_delete</span></body></html> */
	FOLDER_DELETE("folder_delete"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_off</span></body></html> */
	FOLDER_OFF("folder_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_open</span></body></html> */
	FOLDER_OPEN("folder_open"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_shared</span></body></html> */
	FOLDER_SHARED("folder_shared"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_special</span></body></html> */
	FOLDER_SPECIAL("folder_special"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">folder_zip</span></body></html> */
	FOLDER_ZIP("folder_zip"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">follow_the_signs</span></body></html> */
	FOLLOW_THE_SIGNS("follow_the_signs"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">font_download</span></body></html> */
	FONT_DOWNLOAD("font_download"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">font_download_off</span></body></html> */
	FONT_DOWNLOAD_OFF("font_download_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">food_bank</span></body></html> */
	FOOD_BANK("food_bank"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forest</span></body></html> */
	FOREST("forest"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fork_left</span></body></html> */
	FORK_LEFT("fork_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fork_right</span></body></html> */
	FORK_RIGHT("fork_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forklift</span></body></html> */
	FORKLIFT("forklift"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_align_center</span></body></html> */
	FORMAT_ALIGN_CENTER("format_align_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_align_justify</span></body></html> */
	FORMAT_ALIGN_JUSTIFY("format_align_justify"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_align_left</span></body></html> */
	FORMAT_ALIGN_LEFT("format_align_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_align_right</span></body></html> */
	FORMAT_ALIGN_RIGHT("format_align_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_bold</span></body></html> */
	FORMAT_BOLD("format_bold"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_clear</span></body></html> */
	FORMAT_CLEAR("format_clear"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_color_fill</span></body></html> */
	FORMAT_COLOR_FILL("format_color_fill"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_color_reset</span></body></html> */
	FORMAT_COLOR_RESET("format_color_reset"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_color_text</span></body></html> */
	FORMAT_COLOR_TEXT("format_color_text"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_indent_decrease</span></body></html> */
	FORMAT_INDENT_DECREASE("format_indent_decrease"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_indent_increase</span></body></html> */
	FORMAT_INDENT_INCREASE("format_indent_increase"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_italic</span></body></html> */
	FORMAT_ITALIC("format_italic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_line_spacing</span></body></html> */
	FORMAT_LINE_SPACING("format_line_spacing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_list_bulleted</span></body></html> */
	FORMAT_LIST_BULLETED("format_list_bulleted"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_list_bulleted_add</span></body></html> */
	FORMAT_LIST_BULLETED_ADD("format_list_bulleted_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_list_numbered</span></body></html> */
	FORMAT_LIST_NUMBERED("format_list_numbered"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_list_numbered_rtl</span></body></html> */
	FORMAT_LIST_NUMBERED_RTL("format_list_numbered_rtl"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_overline</span></body></html> */
	FORMAT_OVERLINE("format_overline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_paint</span></body></html> */
	FORMAT_PAINT("format_paint"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_quote</span></body></html> */
	FORMAT_QUOTE("format_quote"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_shapes</span></body></html> */
	FORMAT_SHAPES("format_shapes"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_size</span></body></html> */
	FORMAT_SIZE("format_size"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_strikethrough</span></body></html> */
	FORMAT_STRIKETHROUGH("format_strikethrough"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_textdirection_l_to_r</span></body></html> */
	FORMAT_TEXTDIRECTION_L_TO_R("format_textdirection_l_to_r"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_textdirection_r_to_l</span></body></html> */
	FORMAT_TEXTDIRECTION_R_TO_L("format_textdirection_r_to_l"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_underline</span></body></html> */
	FORMAT_UNDERLINE("format_underline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">format_underlined</span></body></html> */
	FORMAT_UNDERLINED("format_underlined"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fort</span></body></html> */
	FORT("fort"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forum</span></body></html> */
	FORUM("forum"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forward</span></body></html> */
	FORWARD("forward"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forward_10</span></body></html> */
	FORWARD_10("forward_10"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forward_30</span></body></html> */
	FORWARD_30("forward_30"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forward_5</span></body></html> */
	FORWARD_5("forward_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">forward_to_inbox</span></body></html> */
	FORWARD_TO_INBOX("forward_to_inbox"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">foundation</span></body></html> */
	FOUNDATION("foundation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">free_breakfast</span></body></html> */
	FREE_BREAKFAST("free_breakfast"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">free_cancellation</span></body></html> */
	FREE_CANCELLATION("free_cancellation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">front_hand</span></body></html> */
	FRONT_HAND("front_hand"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">front_loader</span></body></html> */
	FRONT_LOADER("front_loader"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fullscreen</span></body></html> */
	FULLSCREEN("fullscreen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">fullscreen_exit</span></body></html> */
	FULLSCREEN_EXIT("fullscreen_exit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">functions</span></body></html> */
	FUNCTIONS("functions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">g_mobiledata</span></body></html> */
	G_MOBILEDATA("g_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">g_translate</span></body></html> */
	G_TRANSLATE("g_translate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gamepad</span></body></html> */
	GAMEPAD("gamepad"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">games</span></body></html> */
	GAMES("games"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">garage</span></body></html> */
	GARAGE("garage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gas_meter</span></body></html> */
	GAS_METER("gas_meter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gavel</span></body></html> */
	GAVEL("gavel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">generating_tokens</span></body></html> */
	GENERATING_TOKENS("generating_tokens"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gesture</span></body></html> */
	GESTURE("gesture"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">get_app</span></body></html> */
	GET_APP("get_app"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gif</span></body></html> */
	GIF("gif"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gif_box</span></body></html> */
	GIF_BOX("gif_box"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">girl</span></body></html> */
	GIRL("girl"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gite</span></body></html> */
	GITE("gite"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">goat</span></body></html> */
	GOAT("goat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">golf_course</span></body></html> */
	GOLF_COURSE("golf_course"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gpp_bad</span></body></html> */
	GPP_BAD("gpp_bad"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gpp_good</span></body></html> */
	GPP_GOOD("gpp_good"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gpp_maybe</span></body></html> */
	GPP_MAYBE("gpp_maybe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gps_fixed</span></body></html> */
	GPS_FIXED("gps_fixed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gps_not_fixed</span></body></html> */
	GPS_NOT_FIXED("gps_not_fixed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gps_off</span></body></html> */
	GPS_OFF("gps_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grade</span></body></html> */
	GRADE("grade"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">gradient</span></body></html> */
	GRADIENT("gradient"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grading</span></body></html> */
	GRADING("grading"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grain</span></body></html> */
	GRAIN("grain"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">graphic_eq</span></body></html> */
	GRAPHIC_EQ("graphic_eq"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grass</span></body></html> */
	GRASS("grass"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grid_3x3</span></body></html> */
	GRID_3X3("grid_3x3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grid_4x4</span></body></html> */
	GRID_4X4("grid_4x4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grid_goldenratio</span></body></html> */
	GRID_GOLDENRATIO("grid_goldenratio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grid_off</span></body></html> */
	GRID_OFF("grid_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grid_on</span></body></html> */
	GRID_ON("grid_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">grid_view</span></body></html> */
	GRID_VIEW("grid_view"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">group</span></body></html> */
	GROUP("group"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">group_add</span></body></html> */
	GROUP_ADD("group_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">group_off</span></body></html> */
	GROUP_OFF("group_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">group_remove</span></body></html> */
	GROUP_REMOVE("group_remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">group_work</span></body></html> */
	GROUP_WORK("group_work"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">groups</span></body></html> */
	GROUPS("groups"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">groups_2</span></body></html> */
	GROUPS_2("groups_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">groups_3</span></body></html> */
	GROUPS_3("groups_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">h_mobiledata</span></body></html> */
	H_MOBILEDATA("h_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">h_plus_mobiledata</span></body></html> */
	H_PLUS_MOBILEDATA("h_plus_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hail</span></body></html> */
	HAIL("hail"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">handshake</span></body></html> */
	HANDSHAKE("handshake"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">handyman</span></body></html> */
	HANDYMAN("handyman"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hardware</span></body></html> */
	HARDWARE("hardware"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hd</span></body></html> */
	HD("hd"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_auto</span></body></html> */
	HDR_AUTO("hdr_auto"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_auto_select</span></body></html> */
	HDR_AUTO_SELECT("hdr_auto_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_enhanced_select</span></body></html> */
	HDR_ENHANCED_SELECT("hdr_enhanced_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_off</span></body></html> */
	HDR_OFF("hdr_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_off_select</span></body></html> */
	HDR_OFF_SELECT("hdr_off_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_on</span></body></html> */
	HDR_ON("hdr_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_on_select</span></body></html> */
	HDR_ON_SELECT("hdr_on_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_plus</span></body></html> */
	HDR_PLUS("hdr_plus"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_strong</span></body></html> */
	HDR_STRONG("hdr_strong"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hdr_weak</span></body></html> */
	HDR_WEAK("hdr_weak"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">headphones</span></body></html> */
	HEADPHONES("headphones"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">headphones_battery</span></body></html> */
	HEADPHONES_BATTERY("headphones_battery"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">headset</span></body></html> */
	HEADSET("headset"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">headset_mic</span></body></html> */
	HEADSET_MIC("headset_mic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">headset_off</span></body></html> */
	HEADSET_OFF("headset_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">healing</span></body></html> */
	HEALING("healing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">health_and_safety</span></body></html> */
	HEALTH_AND_SAFETY("health_and_safety"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hearing</span></body></html> */
	HEARING("hearing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hearing_disabled</span></body></html> */
	HEARING_DISABLED("hearing_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">heart_broken</span></body></html> */
	HEART_BROKEN("heart_broken"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">heat_pump</span></body></html> */
	HEAT_PUMP("heat_pump"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">height</span></body></html> */
	HEIGHT("height"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">help</span></body></html> */
	HELP("help"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">help_center</span></body></html> */
	HELP_CENTER("help_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">help_outline</span></body></html> */
	HELP_OUTLINE("help_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hevc</span></body></html> */
	HEVC("hevc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hexagon</span></body></html> */
	HEXAGON("hexagon"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hide_image</span></body></html> */
	HIDE_IMAGE("hide_image"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hide_source</span></body></html> */
	HIDE_SOURCE("hide_source"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">high_quality</span></body></html> */
	HIGH_QUALITY("high_quality"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">highlight</span></body></html> */
	HIGHLIGHT("highlight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">highlight_alt</span></body></html> */
	HIGHLIGHT_ALT("highlight_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">highlight_off</span></body></html> */
	HIGHLIGHT_OFF("highlight_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">highlight_remove</span></body></html> */
	HIGHLIGHT_REMOVE("highlight_remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hiking</span></body></html> */
	HIKING("hiking"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">history</span></body></html> */
	HISTORY("history"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">history_edu</span></body></html> */
	HISTORY_EDU("history_edu"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">history_toggle_off</span></body></html> */
	HISTORY_TOGGLE_OFF("history_toggle_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hive</span></body></html> */
	HIVE("hive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hls</span></body></html> */
	HLS("hls"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hls_off</span></body></html> */
	HLS_OFF("hls_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">holiday_village</span></body></html> */
	HOLIDAY_VILLAGE("holiday_village"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">home</span></body></html> */
	HOME("home"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">home_filled</span></body></html> */
	HOME_FILLED("home_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">home_max</span></body></html> */
	HOME_MAX("home_max"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">home_mini</span></body></html> */
	HOME_MINI("home_mini"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">home_repair_service</span></body></html> */
	HOME_REPAIR_SERVICE("home_repair_service"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">home_work</span></body></html> */
	HOME_WORK("home_work"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">horizontal_distribute</span></body></html> */
	HORIZONTAL_DISTRIBUTE("horizontal_distribute"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">horizontal_rule</span></body></html> */
	HORIZONTAL_RULE("horizontal_rule"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">horizontal_split</span></body></html> */
	HORIZONTAL_SPLIT("horizontal_split"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hot_tub</span></body></html> */
	HOT_TUB("hot_tub"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hotel</span></body></html> */
	HOTEL("hotel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hotel_class</span></body></html> */
	HOTEL_CLASS("hotel_class"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hourglass_bottom</span></body></html> */
	HOURGLASS_BOTTOM("hourglass_bottom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hourglass_disabled</span></body></html> */
	HOURGLASS_DISABLED("hourglass_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hourglass_empty</span></body></html> */
	HOURGLASS_EMPTY("hourglass_empty"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hourglass_full</span></body></html> */
	HOURGLASS_FULL("hourglass_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hourglass_top</span></body></html> */
	HOURGLASS_TOP("hourglass_top"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">house</span></body></html> */
	HOUSE("house"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">house_siding</span></body></html> */
	HOUSE_SIDING("house_siding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">houseboat</span></body></html> */
	HOUSEBOAT("houseboat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">how_to_reg</span></body></html> */
	HOW_TO_REG("how_to_reg"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">how_to_vote</span></body></html> */
	HOW_TO_VOTE("how_to_vote"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">html</span></body></html> */
	HTML("html"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">http</span></body></html> */
	HTTP("http"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">https</span></body></html> */
	HTTPS("https"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hub</span></body></html> */
	HUB("hub"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">hvac</span></body></html> */
	HVAC("hvac"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ice_skating</span></body></html> */
	ICE_SKATING("ice_skating"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">icecream</span></body></html> */
	ICECREAM("icecream"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">image</span></body></html> */
	IMAGE("image"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">image_aspect_ratio</span></body></html> */
	IMAGE_ASPECT_RATIO("image_aspect_ratio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">image_not_supported</span></body></html> */
	IMAGE_NOT_SUPPORTED("image_not_supported"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">image_search</span></body></html> */
	IMAGE_SEARCH("image_search"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">imagesearch_roller</span></body></html> */
	IMAGESEARCH_ROLLER("imagesearch_roller"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">import_contacts</span></body></html> */
	IMPORT_CONTACTS("import_contacts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">import_export</span></body></html> */
	IMPORT_EXPORT("import_export"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">important_devices</span></body></html> */
	IMPORTANT_DEVICES("important_devices"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">inbox</span></body></html> */
	INBOX("inbox"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">incomplete_circle</span></body></html> */
	INCOMPLETE_CIRCLE("incomplete_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">indeterminate_check_box</span></body></html> */
	INDETERMINATE_CHECK_BOX("indeterminate_check_box"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">info</span></body></html> */
	INFO("info"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">info_outline</span></body></html> */
	INFO_OUTLINE("info_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">input</span></body></html> */
	INPUT("input"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_chart</span></body></html> */
	INSERT_CHART("insert_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_chart_outlined</span></body></html> */
	INSERT_CHART_OUTLINED("insert_chart_outlined"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_comment</span></body></html> */
	INSERT_COMMENT("insert_comment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_drive_file</span></body></html> */
	INSERT_DRIVE_FILE("insert_drive_file"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_emoticon</span></body></html> */
	INSERT_EMOTICON("insert_emoticon"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_invitation</span></body></html> */
	INSERT_INVITATION("insert_invitation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_link</span></body></html> */
	INSERT_LINK("insert_link"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_page_break</span></body></html> */
	INSERT_PAGE_BREAK("insert_page_break"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insert_photo</span></body></html> */
	INSERT_PHOTO("insert_photo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">insights</span></body></html> */
	INSIGHTS("insights"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">install_desktop</span></body></html> */
	INSTALL_DESKTOP("install_desktop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">install_mobile</span></body></html> */
	INSTALL_MOBILE("install_mobile"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">integration_instructions</span></body></html> */
	INTEGRATION_INSTRUCTIONS("integration_instructions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">interests</span></body></html> */
	INTERESTS("interests"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">interpreter_mode</span></body></html> */
	INTERPRETER_MODE("interpreter_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">inventory</span></body></html> */
	INVENTORY("inventory"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">inventory_2</span></body></html> */
	INVENTORY_2("inventory_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">invert_colors</span></body></html> */
	INVERT_COLORS("invert_colors"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">invert_colors_off</span></body></html> */
	INVERT_COLORS_OFF("invert_colors_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">invert_colors_on</span></body></html> */
	INVERT_COLORS_ON("invert_colors_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ios_share</span></body></html> */
	IOS_SHARE("ios_share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">iron</span></body></html> */
	IRON("iron"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">iso</span></body></html> */
	ISO("iso"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">javascript</span></body></html> */
	JAVASCRIPT("javascript"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">join_full</span></body></html> */
	JOIN_FULL("join_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">join_inner</span></body></html> */
	JOIN_INNER("join_inner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">join_left</span></body></html> */
	JOIN_LEFT("join_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">join_right</span></body></html> */
	JOIN_RIGHT("join_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">kayaking</span></body></html> */
	KAYAKING("kayaking"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">kebab_dining</span></body></html> */
	KEBAB_DINING("kebab_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">key</span></body></html> */
	KEY("key"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">key_off</span></body></html> */
	KEY_OFF("key_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard</span></body></html> */
	KEYBOARD("keyboard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_alt</span></body></html> */
	KEYBOARD_ALT("keyboard_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_arrow_down</span></body></html> */
	KEYBOARD_ARROW_DOWN("keyboard_arrow_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_arrow_left</span></body></html> */
	KEYBOARD_ARROW_LEFT("keyboard_arrow_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_arrow_right</span></body></html> */
	KEYBOARD_ARROW_RIGHT("keyboard_arrow_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_arrow_up</span></body></html> */
	KEYBOARD_ARROW_UP("keyboard_arrow_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_backspace</span></body></html> */
	KEYBOARD_BACKSPACE("keyboard_backspace"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_capslock</span></body></html> */
	KEYBOARD_CAPSLOCK("keyboard_capslock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_command</span></body></html> */
	KEYBOARD_COMMAND("keyboard_command"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_command_key</span></body></html> */
	KEYBOARD_COMMAND_KEY("keyboard_command_key"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_control</span></body></html> */
	KEYBOARD_CONTROL("keyboard_control"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_control_key</span></body></html> */
	KEYBOARD_CONTROL_KEY("keyboard_control_key"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_double_arrow_down</span></body></html> */
	KEYBOARD_DOUBLE_ARROW_DOWN("keyboard_double_arrow_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_double_arrow_left</span></body></html> */
	KEYBOARD_DOUBLE_ARROW_LEFT("keyboard_double_arrow_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_double_arrow_right</span></body></html> */
	KEYBOARD_DOUBLE_ARROW_RIGHT("keyboard_double_arrow_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_double_arrow_up</span></body></html> */
	KEYBOARD_DOUBLE_ARROW_UP("keyboard_double_arrow_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_hide</span></body></html> */
	KEYBOARD_HIDE("keyboard_hide"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_option</span></body></html> */
	KEYBOARD_OPTION("keyboard_option"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_option_key</span></body></html> */
	KEYBOARD_OPTION_KEY("keyboard_option_key"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_return</span></body></html> */
	KEYBOARD_RETURN("keyboard_return"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_tab</span></body></html> */
	KEYBOARD_TAB("keyboard_tab"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">keyboard_voice</span></body></html> */
	KEYBOARD_VOICE("keyboard_voice"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">king_bed</span></body></html> */
	KING_BED("king_bed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">kitchen</span></body></html> */
	KITCHEN("kitchen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">kitesurfing</span></body></html> */
	KITESURFING("kitesurfing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">label</span></body></html> */
	LABEL("label"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">label_important</span></body></html> */
	LABEL_IMPORTANT("label_important"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">label_important_outline</span></body></html> */
	LABEL_IMPORTANT_OUTLINE("label_important_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">label_off</span></body></html> */
	LABEL_OFF("label_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">label_outline</span></body></html> */
	LABEL_OUTLINE("label_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lan</span></body></html> */
	LAN("lan"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">landscape</span></body></html> */
	LANDSCAPE("landscape"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">landslide</span></body></html> */
	LANDSLIDE("landslide"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">language</span></body></html> */
	LANGUAGE("language"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">laptop</span></body></html> */
	LAPTOP("laptop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">laptop_chromebook</span></body></html> */
	LAPTOP_CHROMEBOOK("laptop_chromebook"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">laptop_mac</span></body></html> */
	LAPTOP_MAC("laptop_mac"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">laptop_windows</span></body></html> */
	LAPTOP_WINDOWS("laptop_windows"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">last_page</span></body></html> */
	LAST_PAGE("last_page"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">launch</span></body></html> */
	LAUNCH("launch"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">layers</span></body></html> */
	LAYERS("layers"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">layers_clear</span></body></html> */
	LAYERS_CLEAR("layers_clear"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">leaderboard</span></body></html> */
	LEADERBOARD("leaderboard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">leak_add</span></body></html> */
	LEAK_ADD("leak_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">leak_remove</span></body></html> */
	LEAK_REMOVE("leak_remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">leave_bags_at_home</span></body></html> */
	LEAVE_BAGS_AT_HOME("leave_bags_at_home"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">legend_toggle</span></body></html> */
	LEGEND_TOGGLE("legend_toggle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lens</span></body></html> */
	LENS("lens"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lens_blur</span></body></html> */
	LENS_BLUR("lens_blur"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">library_add</span></body></html> */
	LIBRARY_ADD("library_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">library_add_check</span></body></html> */
	LIBRARY_ADD_CHECK("library_add_check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">library_books</span></body></html> */
	LIBRARY_BOOKS("library_books"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">library_music</span></body></html> */
	LIBRARY_MUSIC("library_music"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">light</span></body></html> */
	LIGHT("light"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">light_mode</span></body></html> */
	LIGHT_MODE("light_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lightbulb</span></body></html> */
	LIGHTBULB("lightbulb"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lightbulb_circle</span></body></html> */
	LIGHTBULB_CIRCLE("lightbulb_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lightbulb_outline</span></body></html> */
	LIGHTBULB_OUTLINE("lightbulb_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">line_axis</span></body></html> */
	LINE_AXIS("line_axis"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">line_style</span></body></html> */
	LINE_STYLE("line_style"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">line_weight</span></body></html> */
	LINE_WEIGHT("line_weight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">linear_scale</span></body></html> */
	LINEAR_SCALE("linear_scale"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">link</span></body></html> */
	LINK("link"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">link_off</span></body></html> */
	LINK_OFF("link_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">linked_camera</span></body></html> */
	LINKED_CAMERA("linked_camera"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">liquor</span></body></html> */
	LIQUOR("liquor"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">list</span></body></html> */
	LIST("list"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">list_alt</span></body></html> */
	LIST_ALT("list_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">live_help</span></body></html> */
	LIVE_HELP("live_help"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">live_tv</span></body></html> */
	LIVE_TV("live_tv"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">living</span></body></html> */
	LIVING("living"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_activity</span></body></html> */
	LOCAL_ACTIVITY("local_activity"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_airport</span></body></html> */
	LOCAL_AIRPORT("local_airport"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_atm</span></body></html> */
	LOCAL_ATM("local_atm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_attraction</span></body></html> */
	LOCAL_ATTRACTION("local_attraction"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_bar</span></body></html> */
	LOCAL_BAR("local_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_cafe</span></body></html> */
	LOCAL_CAFE("local_cafe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_car_wash</span></body></html> */
	LOCAL_CAR_WASH("local_car_wash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_convenience_store</span></body></html> */
	LOCAL_CONVENIENCE_STORE("local_convenience_store"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_dining</span></body></html> */
	LOCAL_DINING("local_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_drink</span></body></html> */
	LOCAL_DRINK("local_drink"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_fire_department</span></body></html> */
	LOCAL_FIRE_DEPARTMENT("local_fire_department"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_florist</span></body></html> */
	LOCAL_FLORIST("local_florist"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_gas_station</span></body></html> */
	LOCAL_GAS_STATION("local_gas_station"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_grocery_store</span></body></html> */
	LOCAL_GROCERY_STORE("local_grocery_store"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_hospital</span></body></html> */
	LOCAL_HOSPITAL("local_hospital"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_hotel</span></body></html> */
	LOCAL_HOTEL("local_hotel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_laundry_service</span></body></html> */
	LOCAL_LAUNDRY_SERVICE("local_laundry_service"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_library</span></body></html> */
	LOCAL_LIBRARY("local_library"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_mall</span></body></html> */
	LOCAL_MALL("local_mall"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_movies</span></body></html> */
	LOCAL_MOVIES("local_movies"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_offer</span></body></html> */
	LOCAL_OFFER("local_offer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_parking</span></body></html> */
	LOCAL_PARKING("local_parking"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_pharmacy</span></body></html> */
	LOCAL_PHARMACY("local_pharmacy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_phone</span></body></html> */
	LOCAL_PHONE("local_phone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_pizza</span></body></html> */
	LOCAL_PIZZA("local_pizza"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_play</span></body></html> */
	LOCAL_PLAY("local_play"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_police</span></body></html> */
	LOCAL_POLICE("local_police"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_post_office</span></body></html> */
	LOCAL_POST_OFFICE("local_post_office"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_print_shop</span></body></html> */
	LOCAL_PRINT_SHOP("local_print_shop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_printshop</span></body></html> */
	LOCAL_PRINTSHOP("local_printshop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_restaurant</span></body></html> */
	LOCAL_RESTAURANT("local_restaurant"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_see</span></body></html> */
	LOCAL_SEE("local_see"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_shipping</span></body></html> */
	LOCAL_SHIPPING("local_shipping"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">local_taxi</span></body></html> */
	LOCAL_TAXI("local_taxi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_city</span></body></html> */
	LOCATION_CITY("location_city"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_disabled</span></body></html> */
	LOCATION_DISABLED("location_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_history</span></body></html> */
	LOCATION_HISTORY("location_history"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_off</span></body></html> */
	LOCATION_OFF("location_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_on</span></body></html> */
	LOCATION_ON("location_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_pin</span></body></html> */
	LOCATION_PIN("location_pin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">location_searching</span></body></html> */
	LOCATION_SEARCHING("location_searching"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lock</span></body></html> */
	LOCK("lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lock_clock</span></body></html> */
	LOCK_CLOCK("lock_clock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lock_open</span></body></html> */
	LOCK_OPEN("lock_open"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lock_outline</span></body></html> */
	LOCK_OUTLINE("lock_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lock_person</span></body></html> */
	LOCK_PERSON("lock_person"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lock_reset</span></body></html> */
	LOCK_RESET("lock_reset"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">login</span></body></html> */
	LOGIN("login"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">logo_dev</span></body></html> */
	LOGO_DEV("logo_dev"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">logout</span></body></html> */
	LOGOUT("logout"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks</span></body></html> */
	LOOKS("looks"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks_3</span></body></html> */
	LOOKS_3("looks_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks_4</span></body></html> */
	LOOKS_4("looks_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks_5</span></body></html> */
	LOOKS_5("looks_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks_6</span></body></html> */
	LOOKS_6("looks_6"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks_one</span></body></html> */
	LOOKS_ONE("looks_one"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">looks_two</span></body></html> */
	LOOKS_TWO("looks_two"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">loop</span></body></html> */
	LOOP("loop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">loupe</span></body></html> */
	LOUPE("loupe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">low_priority</span></body></html> */
	LOW_PRIORITY("low_priority"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">loyalty</span></body></html> */
	LOYALTY("loyalty"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lte_mobiledata</span></body></html> */
	LTE_MOBILEDATA("lte_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lte_plus_mobiledata</span></body></html> */
	LTE_PLUS_MOBILEDATA("lte_plus_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">luggage</span></body></html> */
	LUGGAGE("luggage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lunch_dining</span></body></html> */
	LUNCH_DINING("lunch_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">lyrics</span></body></html> */
	LYRICS("lyrics"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">macro_off</span></body></html> */
	MACRO_OFF("macro_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mail</span></body></html> */
	MAIL("mail"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mail_lock</span></body></html> */
	MAIL_LOCK("mail_lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mail_outline</span></body></html> */
	MAIL_OUTLINE("mail_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">male</span></body></html> */
	MALE("male"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">man</span></body></html> */
	MAN("man"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">man_2</span></body></html> */
	MAN_2("man_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">man_3</span></body></html> */
	MAN_3("man_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">man_4</span></body></html> */
	MAN_4("man_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">manage_accounts</span></body></html> */
	MANAGE_ACCOUNTS("manage_accounts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">manage_history</span></body></html> */
	MANAGE_HISTORY("manage_history"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">manage_search</span></body></html> */
	MANAGE_SEARCH("manage_search"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">map</span></body></html> */
	MAP("map"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">maps_home_work</span></body></html> */
	MAPS_HOME_WORK("maps_home_work"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">maps_ugc</span></body></html> */
	MAPS_UGC("maps_ugc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">margin</span></body></html> */
	MARGIN("margin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mark_as_unread</span></body></html> */
	MARK_AS_UNREAD("mark_as_unread"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mark_chat_read</span></body></html> */
	MARK_CHAT_READ("mark_chat_read"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mark_chat_unread</span></body></html> */
	MARK_CHAT_UNREAD("mark_chat_unread"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mark_email_read</span></body></html> */
	MARK_EMAIL_READ("mark_email_read"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mark_email_unread</span></body></html> */
	MARK_EMAIL_UNREAD("mark_email_unread"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mark_unread_chat_alt</span></body></html> */
	MARK_UNREAD_CHAT_ALT("mark_unread_chat_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">markunread</span></body></html> */
	MARKUNREAD("markunread"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">markunread_mailbox</span></body></html> */
	MARKUNREAD_MAILBOX("markunread_mailbox"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">masks</span></body></html> */
	MASKS("masks"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">maximize</span></body></html> */
	MAXIMIZE("maximize"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">media_bluetooth_off</span></body></html> */
	MEDIA_BLUETOOTH_OFF("media_bluetooth_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">media_bluetooth_on</span></body></html> */
	MEDIA_BLUETOOTH_ON("media_bluetooth_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mediation</span></body></html> */
	MEDIATION("mediation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">medical_information</span></body></html> */
	MEDICAL_INFORMATION("medical_information"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">medical_services</span></body></html> */
	MEDICAL_SERVICES("medical_services"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">medication</span></body></html> */
	MEDICATION("medication"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">medication_liquid</span></body></html> */
	MEDICATION_LIQUID("medication_liquid"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">meeting_room</span></body></html> */
	MEETING_ROOM("meeting_room"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">memory</span></body></html> */
	MEMORY("memory"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">menu</span></body></html> */
	MENU("menu"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">menu_book</span></body></html> */
	MENU_BOOK("menu_book"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">menu_open</span></body></html> */
	MENU_OPEN("menu_open"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">merge</span></body></html> */
	MERGE("merge"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">merge_type</span></body></html> */
	MERGE_TYPE("merge_type"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">message</span></body></html> */
	MESSAGE("message"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">messenger</span></body></html> */
	MESSENGER("messenger"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">messenger_outline</span></body></html> */
	MESSENGER_OUTLINE("messenger_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mic</span></body></html> */
	MIC("mic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mic_external_off</span></body></html> */
	MIC_EXTERNAL_OFF("mic_external_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mic_external_on</span></body></html> */
	MIC_EXTERNAL_ON("mic_external_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mic_none</span></body></html> */
	MIC_NONE("mic_none"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mic_off</span></body></html> */
	MIC_OFF("mic_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">microwave</span></body></html> */
	MICROWAVE("microwave"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">military_tech</span></body></html> */
	MILITARY_TECH("military_tech"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">minimize</span></body></html> */
	MINIMIZE("minimize"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">minor_crash</span></body></html> */
	MINOR_CRASH("minor_crash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">miscellaneous_services</span></body></html> */
	MISCELLANEOUS_SERVICES("miscellaneous_services"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">missed_video_call</span></body></html> */
	MISSED_VIDEO_CALL("missed_video_call"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mms</span></body></html> */
	MMS("mms"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mobile_friendly</span></body></html> */
	MOBILE_FRIENDLY("mobile_friendly"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mobile_off</span></body></html> */
	MOBILE_OFF("mobile_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mobile_screen_share</span></body></html> */
	MOBILE_SCREEN_SHARE("mobile_screen_share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mobiledata_off</span></body></html> */
	MOBILEDATA_OFF("mobiledata_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode</span></body></html> */
	MODE("mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_comment</span></body></html> */
	MODE_COMMENT("mode_comment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_edit</span></body></html> */
	MODE_EDIT("mode_edit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_edit_outline</span></body></html> */
	MODE_EDIT_OUTLINE("mode_edit_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_fan_off</span></body></html> */
	MODE_FAN_OFF("mode_fan_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_night</span></body></html> */
	MODE_NIGHT("mode_night"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_of_travel</span></body></html> */
	MODE_OF_TRAVEL("mode_of_travel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mode_standby</span></body></html> */
	MODE_STANDBY("mode_standby"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">model_training</span></body></html> */
	MODEL_TRAINING("model_training"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">monetization_on</span></body></html> */
	MONETIZATION_ON("monetization_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">money</span></body></html> */
	MONEY("money"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">money_off</span></body></html> */
	MONEY_OFF("money_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">money_off_csred</span></body></html> */
	MONEY_OFF_CSRED("money_off_csred"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">monitor</span></body></html> */
	MONITOR("monitor"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">monitor_heart</span></body></html> */
	MONITOR_HEART("monitor_heart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">monitor_weight</span></body></html> */
	MONITOR_WEIGHT("monitor_weight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">monochrome_photos</span></body></html> */
	MONOCHROME_PHOTOS("monochrome_photos"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mood</span></body></html> */
	MOOD("mood"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mood_bad</span></body></html> */
	MOOD_BAD("mood_bad"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">moped</span></body></html> */
	MOPED("moped"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">more</span></body></html> */
	MORE("more"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">more_horiz</span></body></html> */
	MORE_HORIZ("more_horiz"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">more_time</span></body></html> */
	MORE_TIME("more_time"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">more_vert</span></body></html> */
	MORE_VERT("more_vert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mosque</span></body></html> */
	MOSQUE("mosque"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">motion_photos_auto</span></body></html> */
	MOTION_PHOTOS_AUTO("motion_photos_auto"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">motion_photos_off</span></body></html> */
	MOTION_PHOTOS_OFF("motion_photos_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">motion_photos_on</span></body></html> */
	MOTION_PHOTOS_ON("motion_photos_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">motion_photos_pause</span></body></html> */
	MOTION_PHOTOS_PAUSE("motion_photos_pause"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">motion_photos_paused</span></body></html> */
	MOTION_PHOTOS_PAUSED("motion_photos_paused"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">motorcycle</span></body></html> */
	MOTORCYCLE("motorcycle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mouse</span></body></html> */
	MOUSE("mouse"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">move_down</span></body></html> */
	MOVE_DOWN("move_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">move_to_inbox</span></body></html> */
	MOVE_TO_INBOX("move_to_inbox"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">move_up</span></body></html> */
	MOVE_UP("move_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">movie</span></body></html> */
	MOVIE("movie"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">movie_creation</span></body></html> */
	MOVIE_CREATION("movie_creation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">movie_edit</span></body></html> */
	MOVIE_EDIT("movie_edit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">movie_filter</span></body></html> */
	MOVIE_FILTER("movie_filter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">moving</span></body></html> */
	MOVING("moving"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">mp</span></body></html> */
	MP("mp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">multiline_chart</span></body></html> */
	MULTILINE_CHART("multiline_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">multiple_stop</span></body></html> */
	MULTIPLE_STOP("multiple_stop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">multitrack_audio</span></body></html> */
	MULTITRACK_AUDIO("multitrack_audio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">museum</span></body></html> */
	MUSEUM("museum"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">music_note</span></body></html> */
	MUSIC_NOTE("music_note"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">music_off</span></body></html> */
	MUSIC_OFF("music_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">music_video</span></body></html> */
	MUSIC_VIDEO("music_video"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">my_library_add</span></body></html> */
	MY_LIBRARY_ADD("my_library_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">my_library_books</span></body></html> */
	MY_LIBRARY_BOOKS("my_library_books"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">my_library_music</span></body></html> */
	MY_LIBRARY_MUSIC("my_library_music"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">my_location</span></body></html> */
	MY_LOCATION("my_location"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nat</span></body></html> */
	NAT("nat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nature</span></body></html> */
	NATURE("nature"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nature_people</span></body></html> */
	NATURE_PEOPLE("nature_people"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">navigate_before</span></body></html> */
	NAVIGATE_BEFORE("navigate_before"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">navigate_next</span></body></html> */
	NAVIGATE_NEXT("navigate_next"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">navigation</span></body></html> */
	NAVIGATION("navigation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">near_me</span></body></html> */
	NEAR_ME("near_me"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">near_me_disabled</span></body></html> */
	NEAR_ME_DISABLED("near_me_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nearby_error</span></body></html> */
	NEARBY_ERROR("nearby_error"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nearby_off</span></body></html> */
	NEARBY_OFF("nearby_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nest_cam_wired_stand</span></body></html> */
	NEST_CAM_WIRED_STAND("nest_cam_wired_stand"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_cell</span></body></html> */
	NETWORK_CELL("network_cell"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_check</span></body></html> */
	NETWORK_CHECK("network_check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_locked</span></body></html> */
	NETWORK_LOCKED("network_locked"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_ping</span></body></html> */
	NETWORK_PING("network_ping"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_wifi</span></body></html> */
	NETWORK_WIFI("network_wifi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_wifi_1_bar</span></body></html> */
	NETWORK_WIFI_1_BAR("network_wifi_1_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_wifi_2_bar</span></body></html> */
	NETWORK_WIFI_2_BAR("network_wifi_2_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">network_wifi_3_bar</span></body></html> */
	NETWORK_WIFI_3_BAR("network_wifi_3_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">new_label</span></body></html> */
	NEW_LABEL("new_label"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">new_releases</span></body></html> */
	NEW_RELEASES("new_releases"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">newspaper</span></body></html> */
	NEWSPAPER("newspaper"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">next_plan</span></body></html> */
	NEXT_PLAN("next_plan"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">next_week</span></body></html> */
	NEXT_WEEK("next_week"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nfc</span></body></html> */
	NFC("nfc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">night_shelter</span></body></html> */
	NIGHT_SHELTER("night_shelter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nightlife</span></body></html> */
	NIGHTLIFE("nightlife"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nightlight</span></body></html> */
	NIGHTLIGHT("nightlight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nightlight_round</span></body></html> */
	NIGHTLIGHT_ROUND("nightlight_round"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nights_stay</span></body></html> */
	NIGHTS_STAY("nights_stay"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_accounts</span></body></html> */
	NO_ACCOUNTS("no_accounts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_adult_content</span></body></html> */
	NO_ADULT_CONTENT("no_adult_content"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_backpack</span></body></html> */
	NO_BACKPACK("no_backpack"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_cell</span></body></html> */
	NO_CELL("no_cell"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_crash</span></body></html> */
	NO_CRASH("no_crash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_drinks</span></body></html> */
	NO_DRINKS("no_drinks"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_encryption</span></body></html> */
	NO_ENCRYPTION("no_encryption"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_encryption_gmailerrorred</span></body></html> */
	NO_ENCRYPTION_GMAILERRORRED("no_encryption_gmailerrorred"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_flash</span></body></html> */
	NO_FLASH("no_flash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_food</span></body></html> */
	NO_FOOD("no_food"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_luggage</span></body></html> */
	NO_LUGGAGE("no_luggage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_meals</span></body></html> */
	NO_MEALS("no_meals"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_meals_ouline</span></body></html> */
	NO_MEALS_OULINE("no_meals_ouline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_meeting_room</span></body></html> */
	NO_MEETING_ROOM("no_meeting_room"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_photography</span></body></html> */
	NO_PHOTOGRAPHY("no_photography"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_sim</span></body></html> */
	NO_SIM("no_sim"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_stroller</span></body></html> */
	NO_STROLLER("no_stroller"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">no_transfer</span></body></html> */
	NO_TRANSFER("no_transfer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">noise_aware</span></body></html> */
	NOISE_AWARE("noise_aware"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">noise_control_off</span></body></html> */
	NOISE_CONTROL_OFF("noise_control_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">nordic_walking</span></body></html> */
	NORDIC_WALKING("nordic_walking"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">north</span></body></html> */
	NORTH("north"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">north_east</span></body></html> */
	NORTH_EAST("north_east"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">north_west</span></body></html> */
	NORTH_WEST("north_west"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">not_accessible</span></body></html> */
	NOT_ACCESSIBLE("not_accessible"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">not_interested</span></body></html> */
	NOT_INTERESTED("not_interested"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">not_listed_location</span></body></html> */
	NOT_LISTED_LOCATION("not_listed_location"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">not_started</span></body></html> */
	NOT_STARTED("not_started"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">note</span></body></html> */
	NOTE("note"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">note_add</span></body></html> */
	NOTE_ADD("note_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">note_alt</span></body></html> */
	NOTE_ALT("note_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notes</span></body></html> */
	NOTES("notes"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notification_add</span></body></html> */
	NOTIFICATION_ADD("notification_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notification_important</span></body></html> */
	NOTIFICATION_IMPORTANT("notification_important"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notifications</span></body></html> */
	NOTIFICATIONS("notifications"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notifications_active</span></body></html> */
	NOTIFICATIONS_ACTIVE("notifications_active"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notifications_none</span></body></html> */
	NOTIFICATIONS_NONE("notifications_none"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notifications_off</span></body></html> */
	NOTIFICATIONS_OFF("notifications_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notifications_on</span></body></html> */
	NOTIFICATIONS_ON("notifications_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">notifications_paused</span></body></html> */
	NOTIFICATIONS_PAUSED("notifications_paused"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">now_wallpaper</span></body></html> */
	NOW_WALLPAPER("now_wallpaper"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">now_widgets</span></body></html> */
	NOW_WIDGETS("now_widgets"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">numbers</span></body></html> */
	NUMBERS("numbers"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">offline_bolt</span></body></html> */
	OFFLINE_BOLT("offline_bolt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">offline_pin</span></body></html> */
	OFFLINE_PIN("offline_pin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">offline_share</span></body></html> */
	OFFLINE_SHARE("offline_share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">oil_barrel</span></body></html> */
	OIL_BARREL("oil_barrel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">on_device_training</span></body></html> */
	ON_DEVICE_TRAINING("on_device_training"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ondemand_video</span></body></html> */
	ONDEMAND_VIDEO("ondemand_video"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">online_prediction</span></body></html> */
	ONLINE_PREDICTION("online_prediction"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">opacity</span></body></html> */
	OPACITY("opacity"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">open_in_browser</span></body></html> */
	OPEN_IN_BROWSER("open_in_browser"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">open_in_full</span></body></html> */
	OPEN_IN_FULL("open_in_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">open_in_new</span></body></html> */
	OPEN_IN_NEW("open_in_new"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">open_in_new_off</span></body></html> */
	OPEN_IN_NEW_OFF("open_in_new_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">open_with</span></body></html> */
	OPEN_WITH("open_with"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">other_houses</span></body></html> */
	OTHER_HOUSES("other_houses"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outbond</span></body></html> */
	OUTBOND("outbond"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outbound</span></body></html> */
	OUTBOUND("outbound"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outbox</span></body></html> */
	OUTBOX("outbox"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outdoor_grill</span></body></html> */
	OUTDOOR_GRILL("outdoor_grill"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outgoing_mail</span></body></html> */
	OUTGOING_MAIL("outgoing_mail"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outlet</span></body></html> */
	OUTLET("outlet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">outlined_flag</span></body></html> */
	OUTLINED_FLAG("outlined_flag"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">output</span></body></html> */
	OUTPUT("output"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">padding</span></body></html> */
	PADDING("padding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pages</span></body></html> */
	PAGES("pages"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pageview</span></body></html> */
	PAGEVIEW("pageview"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">paid</span></body></html> */
	PAID("paid"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">palette</span></body></html> */
	PALETTE("palette"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pallet</span></body></html> */
	PALLET("pallet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pan_tool</span></body></html> */
	PAN_TOOL("pan_tool"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pan_tool_alt</span></body></html> */
	PAN_TOOL_ALT("pan_tool_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama</span></body></html> */
	PANORAMA("panorama"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_fish_eye</span></body></html> */
	PANORAMA_FISH_EYE("panorama_fish_eye"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_fisheye</span></body></html> */
	PANORAMA_FISHEYE("panorama_fisheye"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_horizontal</span></body></html> */
	PANORAMA_HORIZONTAL("panorama_horizontal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_horizontal_select</span></body></html> */
	PANORAMA_HORIZONTAL_SELECT("panorama_horizontal_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_photosphere</span></body></html> */
	PANORAMA_PHOTOSPHERE("panorama_photosphere"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_photosphere_select</span></body></html> */
	PANORAMA_PHOTOSPHERE_SELECT("panorama_photosphere_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_vertical</span></body></html> */
	PANORAMA_VERTICAL("panorama_vertical"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_vertical_select</span></body></html> */
	PANORAMA_VERTICAL_SELECT("panorama_vertical_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_wide_angle</span></body></html> */
	PANORAMA_WIDE_ANGLE("panorama_wide_angle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">panorama_wide_angle_select</span></body></html> */
	PANORAMA_WIDE_ANGLE_SELECT("panorama_wide_angle_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">paragliding</span></body></html> */
	PARAGLIDING("paragliding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">park</span></body></html> */
	PARK("park"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">party_mode</span></body></html> */
	PARTY_MODE("party_mode"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">password</span></body></html> */
	PASSWORD("password"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pattern</span></body></html> */
	PATTERN("pattern"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pause</span></body></html> */
	PAUSE("pause"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pause_circle</span></body></html> */
	PAUSE_CIRCLE("pause_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pause_circle_filled</span></body></html> */
	PAUSE_CIRCLE_FILLED("pause_circle_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pause_circle_outline</span></body></html> */
	PAUSE_CIRCLE_OUTLINE("pause_circle_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pause_presentation</span></body></html> */
	PAUSE_PRESENTATION("pause_presentation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">payment</span></body></html> */
	PAYMENT("payment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">payments</span></body></html> */
	PAYMENTS("payments"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">paypal</span></body></html> */
	PAYPAL("paypal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pedal_bike</span></body></html> */
	PEDAL_BIKE("pedal_bike"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pending</span></body></html> */
	PENDING("pending"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pending_actions</span></body></html> */
	PENDING_ACTIONS("pending_actions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pentagon</span></body></html> */
	PENTAGON("pentagon"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">people</span></body></html> */
	PEOPLE("people"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">people_alt</span></body></html> */
	PEOPLE_ALT("people_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">people_outline</span></body></html> */
	PEOPLE_OUTLINE("people_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">percent</span></body></html> */
	PERCENT("percent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_camera_mic</span></body></html> */
	PERM_CAMERA_MIC("perm_camera_mic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_contact_cal</span></body></html> */
	PERM_CONTACT_CAL("perm_contact_cal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_contact_calendar</span></body></html> */
	PERM_CONTACT_CALENDAR("perm_contact_calendar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_data_setting</span></body></html> */
	PERM_DATA_SETTING("perm_data_setting"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_device_info</span></body></html> */
	PERM_DEVICE_INFO("perm_device_info"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_device_information</span></body></html> */
	PERM_DEVICE_INFORMATION("perm_device_information"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_identity</span></body></html> */
	PERM_IDENTITY("perm_identity"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_media</span></body></html> */
	PERM_MEDIA("perm_media"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_phone_msg</span></body></html> */
	PERM_PHONE_MSG("perm_phone_msg"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">perm_scan_wifi</span></body></html> */
	PERM_SCAN_WIFI("perm_scan_wifi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person</span></body></html> */
	PERSON("person"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_2</span></body></html> */
	PERSON_2("person_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_3</span></body></html> */
	PERSON_3("person_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_4</span></body></html> */
	PERSON_4("person_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_add</span></body></html> */
	PERSON_ADD("person_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_add_alt</span></body></html> */
	PERSON_ADD_ALT("person_add_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_add_alt_1</span></body></html> */
	PERSON_ADD_ALT_1("person_add_alt_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_add_disabled</span></body></html> */
	PERSON_ADD_DISABLED("person_add_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_off</span></body></html> */
	PERSON_OFF("person_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_outline</span></body></html> */
	PERSON_OUTLINE("person_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_pin</span></body></html> */
	PERSON_PIN("person_pin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_pin_circle</span></body></html> */
	PERSON_PIN_CIRCLE("person_pin_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_remove</span></body></html> */
	PERSON_REMOVE("person_remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_remove_alt_1</span></body></html> */
	PERSON_REMOVE_ALT_1("person_remove_alt_1"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">person_search</span></body></html> */
	PERSON_SEARCH("person_search"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">personal_injury</span></body></html> */
	PERSONAL_INJURY("personal_injury"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">personal_video</span></body></html> */
	PERSONAL_VIDEO("personal_video"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pest_control</span></body></html> */
	PEST_CONTROL("pest_control"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pest_control_rodent</span></body></html> */
	PEST_CONTROL_RODENT("pest_control_rodent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pets</span></body></html> */
	PETS("pets"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phishing</span></body></html> */
	PHISHING("phishing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone</span></body></html> */
	PHONE("phone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_android</span></body></html> */
	PHONE_ANDROID("phone_android"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_bluetooth_speaker</span></body></html> */
	PHONE_BLUETOOTH_SPEAKER("phone_bluetooth_speaker"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_callback</span></body></html> */
	PHONE_CALLBACK("phone_callback"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_disabled</span></body></html> */
	PHONE_DISABLED("phone_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_enabled</span></body></html> */
	PHONE_ENABLED("phone_enabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_forwarded</span></body></html> */
	PHONE_FORWARDED("phone_forwarded"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_in_talk</span></body></html> */
	PHONE_IN_TALK("phone_in_talk"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_iphone</span></body></html> */
	PHONE_IPHONE("phone_iphone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_locked</span></body></html> */
	PHONE_LOCKED("phone_locked"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_missed</span></body></html> */
	PHONE_MISSED("phone_missed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phone_paused</span></body></html> */
	PHONE_PAUSED("phone_paused"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phonelink</span></body></html> */
	PHONELINK("phonelink"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phonelink_erase</span></body></html> */
	PHONELINK_ERASE("phonelink_erase"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phonelink_lock</span></body></html> */
	PHONELINK_LOCK("phonelink_lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phonelink_off</span></body></html> */
	PHONELINK_OFF("phonelink_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phonelink_ring</span></body></html> */
	PHONELINK_RING("phonelink_ring"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">phonelink_setup</span></body></html> */
	PHONELINK_SETUP("phonelink_setup"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo</span></body></html> */
	PHOTO("photo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_album</span></body></html> */
	PHOTO_ALBUM("photo_album"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_camera</span></body></html> */
	PHOTO_CAMERA("photo_camera"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_camera_back</span></body></html> */
	PHOTO_CAMERA_BACK("photo_camera_back"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_camera_front</span></body></html> */
	PHOTO_CAMERA_FRONT("photo_camera_front"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_filter</span></body></html> */
	PHOTO_FILTER("photo_filter"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_library</span></body></html> */
	PHOTO_LIBRARY("photo_library"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_size_select_actual</span></body></html> */
	PHOTO_SIZE_SELECT_ACTUAL("photo_size_select_actual"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_size_select_large</span></body></html> */
	PHOTO_SIZE_SELECT_LARGE("photo_size_select_large"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">photo_size_select_small</span></body></html> */
	PHOTO_SIZE_SELECT_SMALL("photo_size_select_small"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">php</span></body></html> */
	PHP("php"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">piano</span></body></html> */
	PIANO("piano"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">piano_off</span></body></html> */
	PIANO_OFF("piano_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">picture_as_pdf</span></body></html> */
	PICTURE_AS_PDF("picture_as_pdf"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">picture_in_picture</span></body></html> */
	PICTURE_IN_PICTURE("picture_in_picture"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">picture_in_picture_alt</span></body></html> */
	PICTURE_IN_PICTURE_ALT("picture_in_picture_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pie_chart</span></body></html> */
	PIE_CHART("pie_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pie_chart_outline</span></body></html> */
	PIE_CHART_OUTLINE("pie_chart_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pie_chart_outlined</span></body></html> */
	PIE_CHART_OUTLINED("pie_chart_outlined"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pin</span></body></html> */
	PIN("pin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pin_drop</span></body></html> */
	PIN_DROP("pin_drop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pin_end</span></body></html> */
	PIN_END("pin_end"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pin_invoke</span></body></html> */
	PIN_INVOKE("pin_invoke"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pinch</span></body></html> */
	PINCH("pinch"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pivot_table_chart</span></body></html> */
	PIVOT_TABLE_CHART("pivot_table_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pix</span></body></html> */
	PIX("pix"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">place</span></body></html> */
	PLACE("place"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">plagiarism</span></body></html> */
	PLAGIARISM("plagiarism"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_arrow</span></body></html> */
	PLAY_ARROW("play_arrow"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_circle</span></body></html> */
	PLAY_CIRCLE("play_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_circle_fill</span></body></html> */
	PLAY_CIRCLE_FILL("play_circle_fill"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_circle_filled</span></body></html> */
	PLAY_CIRCLE_FILLED("play_circle_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_circle_outline</span></body></html> */
	PLAY_CIRCLE_OUTLINE("play_circle_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_disabled</span></body></html> */
	PLAY_DISABLED("play_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_for_work</span></body></html> */
	PLAY_FOR_WORK("play_for_work"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">play_lesson</span></body></html> */
	PLAY_LESSON("play_lesson"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">playlist_add</span></body></html> */
	PLAYLIST_ADD("playlist_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">playlist_add_check</span></body></html> */
	PLAYLIST_ADD_CHECK("playlist_add_check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">playlist_add_check_circle</span></body></html> */
	PLAYLIST_ADD_CHECK_CIRCLE("playlist_add_check_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">playlist_add_circle</span></body></html> */
	PLAYLIST_ADD_CIRCLE("playlist_add_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">playlist_play</span></body></html> */
	PLAYLIST_PLAY("playlist_play"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">playlist_remove</span></body></html> */
	PLAYLIST_REMOVE("playlist_remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">plumbing</span></body></html> */
	PLUMBING("plumbing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">plus_one</span></body></html> */
	PLUS_ONE("plus_one"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">podcasts</span></body></html> */
	PODCASTS("podcasts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">point_of_sale</span></body></html> */
	POINT_OF_SALE("point_of_sale"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">policy</span></body></html> */
	POLICY("policy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">poll</span></body></html> */
	POLL("poll"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">polyline</span></body></html> */
	POLYLINE("polyline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">polymer</span></body></html> */
	POLYMER("polymer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pool</span></body></html> */
	POOL("pool"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">portable_wifi_off</span></body></html> */
	PORTABLE_WIFI_OFF("portable_wifi_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">portrait</span></body></html> */
	PORTRAIT("portrait"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">post_add</span></body></html> */
	POST_ADD("post_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">power</span></body></html> */
	POWER("power"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">power_input</span></body></html> */
	POWER_INPUT("power_input"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">power_off</span></body></html> */
	POWER_OFF("power_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">power_settings_new</span></body></html> */
	POWER_SETTINGS_NEW("power_settings_new"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">precision_manufacturing</span></body></html> */
	PRECISION_MANUFACTURING("precision_manufacturing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">pregnant_woman</span></body></html> */
	PREGNANT_WOMAN("pregnant_woman"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">present_to_all</span></body></html> */
	PRESENT_TO_ALL("present_to_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">preview</span></body></html> */
	PREVIEW("preview"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">price_change</span></body></html> */
	PRICE_CHANGE("price_change"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">price_check</span></body></html> */
	PRICE_CHECK("price_check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">print</span></body></html> */
	PRINT("print"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">print_disabled</span></body></html> */
	PRINT_DISABLED("print_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">priority_high</span></body></html> */
	PRIORITY_HIGH("priority_high"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">privacy_tip</span></body></html> */
	PRIVACY_TIP("privacy_tip"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">private_connectivity</span></body></html> */
	PRIVATE_CONNECTIVITY("private_connectivity"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">production_quantity_limits</span></body></html> */
	PRODUCTION_QUANTITY_LIMITS("production_quantity_limits"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">propane</span></body></html> */
	PROPANE("propane"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">propane_tank</span></body></html> */
	PROPANE_TANK("propane_tank"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">psychology</span></body></html> */
	PSYCHOLOGY("psychology"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">psychology_alt</span></body></html> */
	PSYCHOLOGY_ALT("psychology_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">public</span></body></html> */
	PUBLIC("public"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">public_off</span></body></html> */
	PUBLIC_OFF("public_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">publish</span></body></html> */
	PUBLISH("publish"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">published_with_changes</span></body></html> */
	PUBLISHED_WITH_CHANGES("published_with_changes"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">punch_clock</span></body></html> */
	PUNCH_CLOCK("punch_clock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">push_pin</span></body></html> */
	PUSH_PIN("push_pin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">qr_code</span></body></html> */
	QR_CODE("qr_code"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">qr_code_2</span></body></html> */
	QR_CODE_2("qr_code_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">qr_code_scanner</span></body></html> */
	QR_CODE_SCANNER("qr_code_scanner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">query_builder</span></body></html> */
	QUERY_BUILDER("query_builder"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">query_stats</span></body></html> */
	QUERY_STATS("query_stats"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">question_answer</span></body></html> */
	QUESTION_ANSWER("question_answer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">question_mark</span></body></html> */
	QUESTION_MARK("question_mark"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">queue</span></body></html> */
	QUEUE("queue"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">queue_music</span></body></html> */
	QUEUE_MUSIC("queue_music"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">queue_play_next</span></body></html> */
	QUEUE_PLAY_NEXT("queue_play_next"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">quick_contacts_dialer</span></body></html> */
	QUICK_CONTACTS_DIALER("quick_contacts_dialer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">quick_contacts_mail</span></body></html> */
	QUICK_CONTACTS_MAIL("quick_contacts_mail"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">quickreply</span></body></html> */
	QUICKREPLY("quickreply"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">quiz</span></body></html> */
	QUIZ("quiz"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">quora</span></body></html> */
	QUORA("quora"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">r_mobiledata</span></body></html> */
	R_MOBILEDATA("r_mobiledata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">radar</span></body></html> */
	RADAR("radar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">radio</span></body></html> */
	RADIO("radio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">radio_button_checked</span></body></html> */
	RADIO_BUTTON_CHECKED("radio_button_checked"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">radio_button_off</span></body></html> */
	RADIO_BUTTON_OFF("radio_button_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">radio_button_on</span></body></html> */
	RADIO_BUTTON_ON("radio_button_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">radio_button_unchecked</span></body></html> */
	RADIO_BUTTON_UNCHECKED("radio_button_unchecked"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">railway_alert</span></body></html> */
	RAILWAY_ALERT("railway_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ramen_dining</span></body></html> */
	RAMEN_DINING("ramen_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ramp_left</span></body></html> */
	RAMP_LEFT("ramp_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ramp_right</span></body></html> */
	RAMP_RIGHT("ramp_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rate_review</span></body></html> */
	RATE_REVIEW("rate_review"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">raw_off</span></body></html> */
	RAW_OFF("raw_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">raw_on</span></body></html> */
	RAW_ON("raw_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">read_more</span></body></html> */
	READ_MORE("read_more"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">real_estate_agent</span></body></html> */
	REAL_ESTATE_AGENT("real_estate_agent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rebase_edit</span></body></html> */
	REBASE_EDIT("rebase_edit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">receipt</span></body></html> */
	RECEIPT("receipt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">receipt_long</span></body></html> */
	RECEIPT_LONG("receipt_long"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">recent_actors</span></body></html> */
	RECENT_ACTORS("recent_actors"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">recommend</span></body></html> */
	RECOMMEND("recommend"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">record_voice_over</span></body></html> */
	RECORD_VOICE_OVER("record_voice_over"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rectangle</span></body></html> */
	RECTANGLE("rectangle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">recycling</span></body></html> */
	RECYCLING("recycling"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reddit</span></body></html> */
	REDDIT("reddit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">redeem</span></body></html> */
	REDEEM("redeem"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">redo</span></body></html> */
	REDO("redo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reduce_capacity</span></body></html> */
	REDUCE_CAPACITY("reduce_capacity"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">refresh</span></body></html> */
	REFRESH("refresh"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remember_me</span></body></html> */
	REMEMBER_ME("remember_me"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove</span></body></html> */
	REMOVE("remove"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_circle</span></body></html> */
	REMOVE_CIRCLE("remove_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_circle_outline</span></body></html> */
	REMOVE_CIRCLE_OUTLINE("remove_circle_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_done</span></body></html> */
	REMOVE_DONE("remove_done"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_from_queue</span></body></html> */
	REMOVE_FROM_QUEUE("remove_from_queue"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_moderator</span></body></html> */
	REMOVE_MODERATOR("remove_moderator"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_red_eye</span></body></html> */
	REMOVE_RED_EYE("remove_red_eye"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_road</span></body></html> */
	REMOVE_ROAD("remove_road"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">remove_shopping_cart</span></body></html> */
	REMOVE_SHOPPING_CART("remove_shopping_cart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reorder</span></body></html> */
	REORDER("reorder"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">repartition</span></body></html> */
	REPARTITION("repartition"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">repeat</span></body></html> */
	REPEAT("repeat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">repeat_on</span></body></html> */
	REPEAT_ON("repeat_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">repeat_one</span></body></html> */
	REPEAT_ONE("repeat_one"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">repeat_one_on</span></body></html> */
	REPEAT_ONE_ON("repeat_one_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">replay</span></body></html> */
	REPLAY("replay"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">replay_10</span></body></html> */
	REPLAY_10("replay_10"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">replay_30</span></body></html> */
	REPLAY_30("replay_30"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">replay_5</span></body></html> */
	REPLAY_5("replay_5"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">replay_circle_filled</span></body></html> */
	REPLAY_CIRCLE_FILLED("replay_circle_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reply</span></body></html> */
	REPLY("reply"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reply_all</span></body></html> */
	REPLY_ALL("reply_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">report</span></body></html> */
	REPORT("report"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">report_gmailerrorred</span></body></html> */
	REPORT_GMAILERRORRED("report_gmailerrorred"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">report_off</span></body></html> */
	REPORT_OFF("report_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">report_problem</span></body></html> */
	REPORT_PROBLEM("report_problem"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">request_page</span></body></html> */
	REQUEST_PAGE("request_page"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">request_quote</span></body></html> */
	REQUEST_QUOTE("request_quote"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reset_tv</span></body></html> */
	RESET_TV("reset_tv"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">restart_alt</span></body></html> */
	RESTART_ALT("restart_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">restaurant</span></body></html> */
	RESTAURANT("restaurant"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">restaurant_menu</span></body></html> */
	RESTAURANT_MENU("restaurant_menu"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">restore</span></body></html> */
	RESTORE("restore"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">restore_from_trash</span></body></html> */
	RESTORE_FROM_TRASH("restore_from_trash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">restore_page</span></body></html> */
	RESTORE_PAGE("restore_page"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">reviews</span></body></html> */
	REVIEWS("reviews"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rice_bowl</span></body></html> */
	RICE_BOWL("rice_bowl"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ring_volume</span></body></html> */
	RING_VOLUME("ring_volume"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rocket</span></body></html> */
	ROCKET("rocket"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rocket_launch</span></body></html> */
	ROCKET_LAUNCH("rocket_launch"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">roller_shades</span></body></html> */
	ROLLER_SHADES("roller_shades"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">roller_shades_closed</span></body></html> */
	ROLLER_SHADES_CLOSED("roller_shades_closed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">roller_skating</span></body></html> */
	ROLLER_SKATING("roller_skating"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">roofing</span></body></html> */
	ROOFING("roofing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">room</span></body></html> */
	ROOM("room"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">room_preferences</span></body></html> */
	ROOM_PREFERENCES("room_preferences"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">room_service</span></body></html> */
	ROOM_SERVICE("room_service"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rotate_90_degrees_ccw</span></body></html> */
	ROTATE_90_DEGREES_CCW("rotate_90_degrees_ccw"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rotate_90_degrees_cw</span></body></html> */
	ROTATE_90_DEGREES_CW("rotate_90_degrees_cw"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rotate_left</span></body></html> */
	ROTATE_LEFT("rotate_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rotate_right</span></body></html> */
	ROTATE_RIGHT("rotate_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">roundabout_left</span></body></html> */
	ROUNDABOUT_LEFT("roundabout_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">roundabout_right</span></body></html> */
	ROUNDABOUT_RIGHT("roundabout_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rounded_corner</span></body></html> */
	ROUNDED_CORNER("rounded_corner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">route</span></body></html> */
	ROUTE("route"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">router</span></body></html> */
	ROUTER("router"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rowing</span></body></html> */
	ROWING("rowing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rss_feed</span></body></html> */
	RSS_FEED("rss_feed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rsvp</span></body></html> */
	RSVP("rsvp"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rtt</span></body></html> */
	RTT("rtt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rule</span></body></html> */
	RULE("rule"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rule_folder</span></body></html> */
	RULE_FOLDER("rule_folder"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">run_circle</span></body></html> */
	RUN_CIRCLE("run_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">running_with_errors</span></body></html> */
	RUNNING_WITH_ERRORS("running_with_errors"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">rv_hookup</span></body></html> */
	RV_HOOKUP("rv_hookup"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">safety_check</span></body></html> */
	SAFETY_CHECK("safety_check"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">safety_divider</span></body></html> */
	SAFETY_DIVIDER("safety_divider"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sailing</span></body></html> */
	SAILING("sailing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sanitizer</span></body></html> */
	SANITIZER("sanitizer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">satellite</span></body></html> */
	SATELLITE("satellite"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">satellite_alt</span></body></html> */
	SATELLITE_ALT("satellite_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">save</span></body></html> */
	SAVE("save"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">save_alt</span></body></html> */
	SAVE_ALT("save_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">save_as</span></body></html> */
	SAVE_AS("save_as"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">saved_search</span></body></html> */
	SAVED_SEARCH("saved_search"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">savings</span></body></html> */
	SAVINGS("savings"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">scale</span></body></html> */
	SCALE("scale"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">scanner</span></body></html> */
	SCANNER("scanner"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">scatter_plot</span></body></html> */
	SCATTER_PLOT("scatter_plot"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">schedule</span></body></html> */
	SCHEDULE("schedule"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">schedule_send</span></body></html> */
	SCHEDULE_SEND("schedule_send"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">schema</span></body></html> */
	SCHEMA("schema"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">school</span></body></html> */
	SCHOOL("school"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">science</span></body></html> */
	SCIENCE("science"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">score</span></body></html> */
	SCORE("score"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">scoreboard</span></body></html> */
	SCOREBOARD("scoreboard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_lock_landscape</span></body></html> */
	SCREEN_LOCK_LANDSCAPE("screen_lock_landscape"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_lock_portrait</span></body></html> */
	SCREEN_LOCK_PORTRAIT("screen_lock_portrait"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_lock_rotation</span></body></html> */
	SCREEN_LOCK_ROTATION("screen_lock_rotation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_rotation</span></body></html> */
	SCREEN_ROTATION("screen_rotation"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_rotation_alt</span></body></html> */
	SCREEN_ROTATION_ALT("screen_rotation_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_search_desktop</span></body></html> */
	SCREEN_SEARCH_DESKTOP("screen_search_desktop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screen_share</span></body></html> */
	SCREEN_SHARE("screen_share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screenshot</span></body></html> */
	SCREENSHOT("screenshot"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">screenshot_monitor</span></body></html> */
	SCREENSHOT_MONITOR("screenshot_monitor"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">scuba_diving</span></body></html> */
	SCUBA_DIVING("scuba_diving"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sd</span></body></html> */
	SD("sd"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sd_card</span></body></html> */
	SD_CARD("sd_card"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sd_card_alert</span></body></html> */
	SD_CARD_ALERT("sd_card_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sd_storage</span></body></html> */
	SD_STORAGE("sd_storage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">search</span></body></html> */
	SEARCH("search"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">search_off</span></body></html> */
	SEARCH_OFF("search_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">security</span></body></html> */
	SECURITY("security"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">security_update</span></body></html> */
	SECURITY_UPDATE("security_update"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">security_update_good</span></body></html> */
	SECURITY_UPDATE_GOOD("security_update_good"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">security_update_warning</span></body></html> */
	SECURITY_UPDATE_WARNING("security_update_warning"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">segment</span></body></html> */
	SEGMENT("segment"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">select_all</span></body></html> */
	SELECT_ALL("select_all"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">self_improvement</span></body></html> */
	SELF_IMPROVEMENT("self_improvement"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sell</span></body></html> */
	SELL("sell"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">send</span></body></html> */
	SEND("send"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">send_and_archive</span></body></html> */
	SEND_AND_ARCHIVE("send_and_archive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">send_time_extension</span></body></html> */
	SEND_TIME_EXTENSION("send_time_extension"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">send_to_mobile</span></body></html> */
	SEND_TO_MOBILE("send_to_mobile"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sensor_door</span></body></html> */
	SENSOR_DOOR("sensor_door"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sensor_occupied</span></body></html> */
	SENSOR_OCCUPIED("sensor_occupied"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sensor_window</span></body></html> */
	SENSOR_WINDOW("sensor_window"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sensors</span></body></html> */
	SENSORS("sensors"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sensors_off</span></body></html> */
	SENSORS_OFF("sensors_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sentiment_dissatisfied</span></body></html> */
	SENTIMENT_DISSATISFIED("sentiment_dissatisfied"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sentiment_neutral</span></body></html> */
	SENTIMENT_NEUTRAL("sentiment_neutral"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sentiment_satisfied</span></body></html> */
	SENTIMENT_SATISFIED("sentiment_satisfied"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sentiment_satisfied_alt</span></body></html> */
	SENTIMENT_SATISFIED_ALT("sentiment_satisfied_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sentiment_very_dissatisfied</span></body></html> */
	SENTIMENT_VERY_DISSATISFIED("sentiment_very_dissatisfied"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sentiment_very_satisfied</span></body></html> */
	SENTIMENT_VERY_SATISFIED("sentiment_very_satisfied"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">set_meal</span></body></html> */
	SET_MEAL("set_meal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings</span></body></html> */
	SETTINGS("settings"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_accessibility</span></body></html> */
	SETTINGS_ACCESSIBILITY("settings_accessibility"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_applications</span></body></html> */
	SETTINGS_APPLICATIONS("settings_applications"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_backup_restore</span></body></html> */
	SETTINGS_BACKUP_RESTORE("settings_backup_restore"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_bluetooth</span></body></html> */
	SETTINGS_BLUETOOTH("settings_bluetooth"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_brightness</span></body></html> */
	SETTINGS_BRIGHTNESS("settings_brightness"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_cell</span></body></html> */
	SETTINGS_CELL("settings_cell"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_display</span></body></html> */
	SETTINGS_DISPLAY("settings_display"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_ethernet</span></body></html> */
	SETTINGS_ETHERNET("settings_ethernet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_input_antenna</span></body></html> */
	SETTINGS_INPUT_ANTENNA("settings_input_antenna"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_input_component</span></body></html> */
	SETTINGS_INPUT_COMPONENT("settings_input_component"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_input_composite</span></body></html> */
	SETTINGS_INPUT_COMPOSITE("settings_input_composite"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_input_hdmi</span></body></html> */
	SETTINGS_INPUT_HDMI("settings_input_hdmi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_input_svideo</span></body></html> */
	SETTINGS_INPUT_SVIDEO("settings_input_svideo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_overscan</span></body></html> */
	SETTINGS_OVERSCAN("settings_overscan"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_phone</span></body></html> */
	SETTINGS_PHONE("settings_phone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_power</span></body></html> */
	SETTINGS_POWER("settings_power"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_remote</span></body></html> */
	SETTINGS_REMOTE("settings_remote"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_suggest</span></body></html> */
	SETTINGS_SUGGEST("settings_suggest"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_system_daydream</span></body></html> */
	SETTINGS_SYSTEM_DAYDREAM("settings_system_daydream"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">settings_voice</span></body></html> */
	SETTINGS_VOICE("settings_voice"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">severe_cold</span></body></html> */
	SEVERE_COLD("severe_cold"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shape_line</span></body></html> */
	SHAPE_LINE("shape_line"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">share</span></body></html> */
	SHARE("share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">share_arrival_time</span></body></html> */
	SHARE_ARRIVAL_TIME("share_arrival_time"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">share_location</span></body></html> */
	SHARE_LOCATION("share_location"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shelves</span></body></html> */
	SHELVES("shelves"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shield</span></body></html> */
	SHIELD("shield"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shield_moon</span></body></html> */
	SHIELD_MOON("shield_moon"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shop</span></body></html> */
	SHOP("shop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shop_2</span></body></html> */
	SHOP_2("shop_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shop_two</span></body></html> */
	SHOP_TWO("shop_two"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shopify</span></body></html> */
	SHOPIFY("shopify"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shopping_bag</span></body></html> */
	SHOPPING_BAG("shopping_bag"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shopping_basket</span></body></html> */
	SHOPPING_BASKET("shopping_basket"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shopping_cart</span></body></html> */
	SHOPPING_CART("shopping_cart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shopping_cart_checkout</span></body></html> */
	SHOPPING_CART_CHECKOUT("shopping_cart_checkout"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">short_text</span></body></html> */
	SHORT_TEXT("short_text"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shortcut</span></body></html> */
	SHORTCUT("shortcut"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">show_chart</span></body></html> */
	SHOW_CHART("show_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shower</span></body></html> */
	SHOWER("shower"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shuffle</span></body></html> */
	SHUFFLE("shuffle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shuffle_on</span></body></html> */
	SHUFFLE_ON("shuffle_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">shutter_speed</span></body></html> */
	SHUTTER_SPEED("shutter_speed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sick</span></body></html> */
	SICK("sick"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sign_language</span></body></html> */
	SIGN_LANGUAGE("sign_language"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_0_bar</span></body></html> */
	SIGNAL_CELLULAR_0_BAR("signal_cellular_0_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_4_bar</span></body></html> */
	SIGNAL_CELLULAR_4_BAR("signal_cellular_4_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_alt</span></body></html> */
	SIGNAL_CELLULAR_ALT("signal_cellular_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_alt_1_bar</span></body></html> */
	SIGNAL_CELLULAR_ALT_1_BAR("signal_cellular_alt_1_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_alt_2_bar</span></body></html> */
	SIGNAL_CELLULAR_ALT_2_BAR("signal_cellular_alt_2_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_connected_no_internet_0_bar</span></body></html> */
	SIGNAL_CELLULAR_CONNECTED_NO_INTERNET_0_BAR("signal_cellular_connected_no_internet_0_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_connected_no_internet_4_bar</span></body></html> */
	SIGNAL_CELLULAR_CONNECTED_NO_INTERNET_4_BAR("signal_cellular_connected_no_internet_4_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_no_sim</span></body></html> */
	SIGNAL_CELLULAR_NO_SIM("signal_cellular_no_sim"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_nodata</span></body></html> */
	SIGNAL_CELLULAR_NODATA("signal_cellular_nodata"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_null</span></body></html> */
	SIGNAL_CELLULAR_NULL("signal_cellular_null"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_cellular_off</span></body></html> */
	SIGNAL_CELLULAR_OFF("signal_cellular_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_0_bar</span></body></html> */
	SIGNAL_WIFI_0_BAR("signal_wifi_0_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_4_bar</span></body></html> */
	SIGNAL_WIFI_4_BAR("signal_wifi_4_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_4_bar_lock</span></body></html> */
	SIGNAL_WIFI_4_BAR_LOCK("signal_wifi_4_bar_lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_bad</span></body></html> */
	SIGNAL_WIFI_BAD("signal_wifi_bad"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_connected_no_internet_4</span></body></html> */
	SIGNAL_WIFI_CONNECTED_NO_INTERNET_4("signal_wifi_connected_no_internet_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_off</span></body></html> */
	SIGNAL_WIFI_OFF("signal_wifi_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_statusbar_4_bar</span></body></html> */
	SIGNAL_WIFI_STATUSBAR_4_BAR("signal_wifi_statusbar_4_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_statusbar_connected_no_internet_4</span></body></html> */
	SIGNAL_WIFI_STATUSBAR_CONNECTED_NO_INTERNET_4("signal_wifi_statusbar_connected_no_internet_4"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signal_wifi_statusbar_null</span></body></html> */
	SIGNAL_WIFI_STATUSBAR_NULL("signal_wifi_statusbar_null"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">signpost</span></body></html> */
	SIGNPOST("signpost"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sim_card</span></body></html> */
	SIM_CARD("sim_card"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sim_card_alert</span></body></html> */
	SIM_CARD_ALERT("sim_card_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sim_card_download</span></body></html> */
	SIM_CARD_DOWNLOAD("sim_card_download"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">single_bed</span></body></html> */
	SINGLE_BED("single_bed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sip</span></body></html> */
	SIP("sip"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">skateboarding</span></body></html> */
	SKATEBOARDING("skateboarding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">skip_next</span></body></html> */
	SKIP_NEXT("skip_next"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">skip_previous</span></body></html> */
	SKIP_PREVIOUS("skip_previous"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sledding</span></body></html> */
	SLEDDING("sledding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">slideshow</span></body></html> */
	SLIDESHOW("slideshow"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">slow_motion_video</span></body></html> */
	SLOW_MOTION_VIDEO("slow_motion_video"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smart_button</span></body></html> */
	SMART_BUTTON("smart_button"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smart_display</span></body></html> */
	SMART_DISPLAY("smart_display"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smart_screen</span></body></html> */
	SMART_SCREEN("smart_screen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smart_toy</span></body></html> */
	SMART_TOY("smart_toy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smartphone</span></body></html> */
	SMARTPHONE("smartphone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smoke_free</span></body></html> */
	SMOKE_FREE("smoke_free"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">smoking_rooms</span></body></html> */
	SMOKING_ROOMS("smoking_rooms"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sms</span></body></html> */
	SMS("sms"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sms_failed</span></body></html> */
	SMS_FAILED("sms_failed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snapchat</span></body></html> */
	SNAPCHAT("snapchat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snippet_folder</span></body></html> */
	SNIPPET_FOLDER("snippet_folder"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snooze</span></body></html> */
	SNOOZE("snooze"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snowboarding</span></body></html> */
	SNOWBOARDING("snowboarding"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snowing</span></body></html> */
	SNOWING("snowing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snowmobile</span></body></html> */
	SNOWMOBILE("snowmobile"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">snowshoeing</span></body></html> */
	SNOWSHOEING("snowshoeing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">soap</span></body></html> */
	SOAP("soap"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">social_distance</span></body></html> */
	SOCIAL_DISTANCE("social_distance"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">solar_power</span></body></html> */
	SOLAR_POWER("solar_power"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sort</span></body></html> */
	SORT("sort"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sort_by_alpha</span></body></html> */
	SORT_BY_ALPHA("sort_by_alpha"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sos</span></body></html> */
	SOS("sos"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">soup_kitchen</span></body></html> */
	SOUP_KITCHEN("soup_kitchen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">source</span></body></html> */
	SOURCE("source"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">south</span></body></html> */
	SOUTH("south"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">south_america</span></body></html> */
	SOUTH_AMERICA("south_america"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">south_east</span></body></html> */
	SOUTH_EAST("south_east"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">south_west</span></body></html> */
	SOUTH_WEST("south_west"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">spa</span></body></html> */
	SPA("spa"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">space_bar</span></body></html> */
	SPACE_BAR("space_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">space_dashboard</span></body></html> */
	SPACE_DASHBOARD("space_dashboard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">spatial_audio</span></body></html> */
	SPATIAL_AUDIO("spatial_audio"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">spatial_audio_off</span></body></html> */
	SPATIAL_AUDIO_OFF("spatial_audio_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">spatial_tracking</span></body></html> */
	SPATIAL_TRACKING("spatial_tracking"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">speaker</span></body></html> */
	SPEAKER("speaker"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">speaker_group</span></body></html> */
	SPEAKER_GROUP("speaker_group"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">speaker_notes</span></body></html> */
	SPEAKER_NOTES("speaker_notes"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">speaker_notes_off</span></body></html> */
	SPEAKER_NOTES_OFF("speaker_notes_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">speaker_phone</span></body></html> */
	SPEAKER_PHONE("speaker_phone"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">speed</span></body></html> */
	SPEED("speed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">spellcheck</span></body></html> */
	SPELLCHECK("spellcheck"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">splitscreen</span></body></html> */
	SPLITSCREEN("splitscreen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">spoke</span></body></html> */
	SPOKE("spoke"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports</span></body></html> */
	SPORTS("sports"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_bar</span></body></html> */
	SPORTS_BAR("sports_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_baseball</span></body></html> */
	SPORTS_BASEBALL("sports_baseball"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_basketball</span></body></html> */
	SPORTS_BASKETBALL("sports_basketball"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_cricket</span></body></html> */
	SPORTS_CRICKET("sports_cricket"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_esports</span></body></html> */
	SPORTS_ESPORTS("sports_esports"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_football</span></body></html> */
	SPORTS_FOOTBALL("sports_football"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_golf</span></body></html> */
	SPORTS_GOLF("sports_golf"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_gymnastics</span></body></html> */
	SPORTS_GYMNASTICS("sports_gymnastics"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_handball</span></body></html> */
	SPORTS_HANDBALL("sports_handball"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_hockey</span></body></html> */
	SPORTS_HOCKEY("sports_hockey"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_kabaddi</span></body></html> */
	SPORTS_KABADDI("sports_kabaddi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_martial_arts</span></body></html> */
	SPORTS_MARTIAL_ARTS("sports_martial_arts"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_mma</span></body></html> */
	SPORTS_MMA("sports_mma"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_motorsports</span></body></html> */
	SPORTS_MOTORSPORTS("sports_motorsports"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_rugby</span></body></html> */
	SPORTS_RUGBY("sports_rugby"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_score</span></body></html> */
	SPORTS_SCORE("sports_score"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_soccer</span></body></html> */
	SPORTS_SOCCER("sports_soccer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_tennis</span></body></html> */
	SPORTS_TENNIS("sports_tennis"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sports_volleyball</span></body></html> */
	SPORTS_VOLLEYBALL("sports_volleyball"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">square</span></body></html> */
	SQUARE("square"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">square_foot</span></body></html> */
	SQUARE_FOOT("square_foot"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">ssid_chart</span></body></html> */
	SSID_CHART("ssid_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stacked_bar_chart</span></body></html> */
	STACKED_BAR_CHART("stacked_bar_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stacked_line_chart</span></body></html> */
	STACKED_LINE_CHART("stacked_line_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stadium</span></body></html> */
	STADIUM("stadium"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stairs</span></body></html> */
	STAIRS("stairs"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star</span></body></html> */
	STAR("star"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star_border</span></body></html> */
	STAR_BORDER("star_border"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star_border_purple500</span></body></html> */
	STAR_BORDER_PURPLE500("star_border_purple500"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star_half</span></body></html> */
	STAR_HALF("star_half"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star_outline</span></body></html> */
	STAR_OUTLINE("star_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star_purple500</span></body></html> */
	STAR_PURPLE500("star_purple500"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">star_rate</span></body></html> */
	STAR_RATE("star_rate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stars</span></body></html> */
	STARS("stars"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">start</span></body></html> */
	START("start"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stay_current_landscape</span></body></html> */
	STAY_CURRENT_LANDSCAPE("stay_current_landscape"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stay_current_portrait</span></body></html> */
	STAY_CURRENT_PORTRAIT("stay_current_portrait"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stay_primary_landscape</span></body></html> */
	STAY_PRIMARY_LANDSCAPE("stay_primary_landscape"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stay_primary_portrait</span></body></html> */
	STAY_PRIMARY_PORTRAIT("stay_primary_portrait"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sticky_note_2</span></body></html> */
	STICKY_NOTE_2("sticky_note_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stop</span></body></html> */
	STOP("stop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stop_circle</span></body></html> */
	STOP_CIRCLE("stop_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stop_screen_share</span></body></html> */
	STOP_SCREEN_SHARE("stop_screen_share"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">storage</span></body></html> */
	STORAGE("storage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">store</span></body></html> */
	STORE("store"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">store_mall_directory</span></body></html> */
	STORE_MALL_DIRECTORY("store_mall_directory"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">storefront</span></body></html> */
	STOREFRONT("storefront"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">storm</span></body></html> */
	STORM("storm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">straight</span></body></html> */
	STRAIGHT("straight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">straighten</span></body></html> */
	STRAIGHTEN("straighten"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stream</span></body></html> */
	STREAM("stream"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">streetview</span></body></html> */
	STREETVIEW("streetview"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">strikethrough_s</span></body></html> */
	STRIKETHROUGH_S("strikethrough_s"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">stroller</span></body></html> */
	STROLLER("stroller"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">style</span></body></html> */
	STYLE("style"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subdirectory_arrow_left</span></body></html> */
	SUBDIRECTORY_ARROW_LEFT("subdirectory_arrow_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subdirectory_arrow_right</span></body></html> */
	SUBDIRECTORY_ARROW_RIGHT("subdirectory_arrow_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subject</span></body></html> */
	SUBJECT("subject"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subscript</span></body></html> */
	SUBSCRIPT("subscript"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subscriptions</span></body></html> */
	SUBSCRIPTIONS("subscriptions"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subtitles</span></body></html> */
	SUBTITLES("subtitles"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subtitles_off</span></body></html> */
	SUBTITLES_OFF("subtitles_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">subway</span></body></html> */
	SUBWAY("subway"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">summarize</span></body></html> */
	SUMMARIZE("summarize"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sunny</span></body></html> */
	SUNNY("sunny"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sunny_snowing</span></body></html> */
	SUNNY_SNOWING("sunny_snowing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">superscript</span></body></html> */
	SUPERSCRIPT("superscript"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">supervised_user_circle</span></body></html> */
	SUPERVISED_USER_CIRCLE("supervised_user_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">supervisor_account</span></body></html> */
	SUPERVISOR_ACCOUNT("supervisor_account"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">support</span></body></html> */
	SUPPORT("support"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">support_agent</span></body></html> */
	SUPPORT_AGENT("support_agent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">surfing</span></body></html> */
	SURFING("surfing"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">surround_sound</span></body></html> */
	SURROUND_SOUND("surround_sound"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swap_calls</span></body></html> */
	SWAP_CALLS("swap_calls"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swap_horiz</span></body></html> */
	SWAP_HORIZ("swap_horiz"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swap_horizontal_circle</span></body></html> */
	SWAP_HORIZONTAL_CIRCLE("swap_horizontal_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swap_vert</span></body></html> */
	SWAP_VERT("swap_vert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swap_vert_circle</span></body></html> */
	SWAP_VERT_CIRCLE("swap_vert_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swap_vertical_circle</span></body></html> */
	SWAP_VERTICAL_CIRCLE("swap_vertical_circle"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe</span></body></html> */
	SWIPE("swipe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_down</span></body></html> */
	SWIPE_DOWN("swipe_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_down_alt</span></body></html> */
	SWIPE_DOWN_ALT("swipe_down_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_left</span></body></html> */
	SWIPE_LEFT("swipe_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_left_alt</span></body></html> */
	SWIPE_LEFT_ALT("swipe_left_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_right</span></body></html> */
	SWIPE_RIGHT("swipe_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_right_alt</span></body></html> */
	SWIPE_RIGHT_ALT("swipe_right_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_up</span></body></html> */
	SWIPE_UP("swipe_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_up_alt</span></body></html> */
	SWIPE_UP_ALT("swipe_up_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">swipe_vertical</span></body></html> */
	SWIPE_VERTICAL("swipe_vertical"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_access_shortcut</span></body></html> */
	SWITCH_ACCESS_SHORTCUT("switch_access_shortcut"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_access_shortcut_add</span></body></html> */
	SWITCH_ACCESS_SHORTCUT_ADD("switch_access_shortcut_add"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_account</span></body></html> */
	SWITCH_ACCOUNT("switch_account"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_camera</span></body></html> */
	SWITCH_CAMERA("switch_camera"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_left</span></body></html> */
	SWITCH_LEFT("switch_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_right</span></body></html> */
	SWITCH_RIGHT("switch_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">switch_video</span></body></html> */
	SWITCH_VIDEO("switch_video"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">synagogue</span></body></html> */
	SYNAGOGUE("synagogue"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sync</span></body></html> */
	SYNC("sync"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sync_alt</span></body></html> */
	SYNC_ALT("sync_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sync_disabled</span></body></html> */
	SYNC_DISABLED("sync_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sync_lock</span></body></html> */
	SYNC_LOCK("sync_lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">sync_problem</span></body></html> */
	SYNC_PROBLEM("sync_problem"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">system_security_update</span></body></html> */
	SYSTEM_SECURITY_UPDATE("system_security_update"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">system_security_update_good</span></body></html> */
	SYSTEM_SECURITY_UPDATE_GOOD("system_security_update_good"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">system_security_update_warning</span></body></html> */
	SYSTEM_SECURITY_UPDATE_WARNING("system_security_update_warning"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">system_update</span></body></html> */
	SYSTEM_UPDATE("system_update"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">system_update_alt</span></body></html> */
	SYSTEM_UPDATE_ALT("system_update_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">system_update_tv</span></body></html> */
	SYSTEM_UPDATE_TV("system_update_tv"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tab</span></body></html> */
	TAB("tab"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tab_unselected</span></body></html> */
	TAB_UNSELECTED("tab_unselected"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">table_bar</span></body></html> */
	TABLE_BAR("table_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">table_chart</span></body></html> */
	TABLE_CHART("table_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">table_restaurant</span></body></html> */
	TABLE_RESTAURANT("table_restaurant"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">table_rows</span></body></html> */
	TABLE_ROWS("table_rows"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">table_view</span></body></html> */
	TABLE_VIEW("table_view"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tablet</span></body></html> */
	TABLET("tablet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tablet_android</span></body></html> */
	TABLET_ANDROID("tablet_android"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tablet_mac</span></body></html> */
	TABLET_MAC("tablet_mac"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tag</span></body></html> */
	TAG("tag"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tag_faces</span></body></html> */
	TAG_FACES("tag_faces"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">takeout_dining</span></body></html> */
	TAKEOUT_DINING("takeout_dining"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tap_and_play</span></body></html> */
	TAP_AND_PLAY("tap_and_play"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tapas</span></body></html> */
	TAPAS("tapas"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">task</span></body></html> */
	TASK("task"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">task_alt</span></body></html> */
	TASK_ALT("task_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">taxi_alert</span></body></html> */
	TAXI_ALERT("taxi_alert"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">telegram</span></body></html> */
	TELEGRAM("telegram"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">temple_buddhist</span></body></html> */
	TEMPLE_BUDDHIST("temple_buddhist"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">temple_hindu</span></body></html> */
	TEMPLE_HINDU("temple_hindu"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">terminal</span></body></html> */
	TERMINAL("terminal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">terrain</span></body></html> */
	TERRAIN("terrain"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_decrease</span></body></html> */
	TEXT_DECREASE("text_decrease"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_fields</span></body></html> */
	TEXT_FIELDS("text_fields"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_format</span></body></html> */
	TEXT_FORMAT("text_format"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_increase</span></body></html> */
	TEXT_INCREASE("text_increase"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_rotate_up</span></body></html> */
	TEXT_ROTATE_UP("text_rotate_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_rotate_vertical</span></body></html> */
	TEXT_ROTATE_VERTICAL("text_rotate_vertical"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_rotation_angledown</span></body></html> */
	TEXT_ROTATION_ANGLEDOWN("text_rotation_angledown"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_rotation_angleup</span></body></html> */
	TEXT_ROTATION_ANGLEUP("text_rotation_angleup"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_rotation_down</span></body></html> */
	TEXT_ROTATION_DOWN("text_rotation_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_rotation_none</span></body></html> */
	TEXT_ROTATION_NONE("text_rotation_none"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">text_snippet</span></body></html> */
	TEXT_SNIPPET("text_snippet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">textsms</span></body></html> */
	TEXTSMS("textsms"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">texture</span></body></html> */
	TEXTURE("texture"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">theater_comedy</span></body></html> */
	THEATER_COMEDY("theater_comedy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">theaters</span></body></html> */
	THEATERS("theaters"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thermostat</span></body></html> */
	THERMOSTAT("thermostat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thermostat_auto</span></body></html> */
	THERMOSTAT_AUTO("thermostat_auto"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumb_down</span></body></html> */
	THUMB_DOWN("thumb_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumb_down_alt</span></body></html> */
	THUMB_DOWN_ALT("thumb_down_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumb_down_off_alt</span></body></html> */
	THUMB_DOWN_OFF_ALT("thumb_down_off_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumb_up</span></body></html> */
	THUMB_UP("thumb_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumb_up_alt</span></body></html> */
	THUMB_UP_ALT("thumb_up_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumb_up_off_alt</span></body></html> */
	THUMB_UP_OFF_ALT("thumb_up_off_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thumbs_up_down</span></body></html> */
	THUMBS_UP_DOWN("thumbs_up_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">thunderstorm</span></body></html> */
	THUNDERSTORM("thunderstorm"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tiktok</span></body></html> */
	TIKTOK("tiktok"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">time_to_leave</span></body></html> */
	TIME_TO_LEAVE("time_to_leave"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timelapse</span></body></html> */
	TIMELAPSE("timelapse"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timeline</span></body></html> */
	TIMELINE("timeline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timer</span></body></html> */
	TIMER("timer"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timer_10</span></body></html> */
	TIMER_10("timer_10"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timer_10_select</span></body></html> */
	TIMER_10_SELECT("timer_10_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timer_3</span></body></html> */
	TIMER_3("timer_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timer_3_select</span></body></html> */
	TIMER_3_SELECT("timer_3_select"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">timer_off</span></body></html> */
	TIMER_OFF("timer_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tips_and_updates</span></body></html> */
	TIPS_AND_UPDATES("tips_and_updates"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tire_repair</span></body></html> */
	TIRE_REPAIR("tire_repair"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">title</span></body></html> */
	TITLE("title"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">toc</span></body></html> */
	TOC("toc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">today</span></body></html> */
	TODAY("today"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">toggle_off</span></body></html> */
	TOGGLE_OFF("toggle_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">toggle_on</span></body></html> */
	TOGGLE_ON("toggle_on"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">token</span></body></html> */
	TOKEN("token"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">toll</span></body></html> */
	TOLL("toll"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tonality</span></body></html> */
	TONALITY("tonality"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">topic</span></body></html> */
	TOPIC("topic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tornado</span></body></html> */
	TORNADO("tornado"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">touch_app</span></body></html> */
	TOUCH_APP("touch_app"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tour</span></body></html> */
	TOUR("tour"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">toys</span></body></html> */
	TOYS("toys"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">track_changes</span></body></html> */
	TRACK_CHANGES("track_changes"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">traffic</span></body></html> */
	TRAFFIC("traffic"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">train</span></body></html> */
	TRAIN("train"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tram</span></body></html> */
	TRAM("tram"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">transcribe</span></body></html> */
	TRANSCRIBE("transcribe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">transfer_within_a_station</span></body></html> */
	TRANSFER_WITHIN_A_STATION("transfer_within_a_station"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">transform</span></body></html> */
	TRANSFORM("transform"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">transgender</span></body></html> */
	TRANSGENDER("transgender"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">transit_enterexit</span></body></html> */
	TRANSIT_ENTEREXIT("transit_enterexit"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">translate</span></body></html> */
	TRANSLATE("translate"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">travel_explore</span></body></html> */
	TRAVEL_EXPLORE("travel_explore"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">trending_down</span></body></html> */
	TRENDING_DOWN("trending_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">trending_flat</span></body></html> */
	TRENDING_FLAT("trending_flat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">trending_neutral</span></body></html> */
	TRENDING_NEUTRAL("trending_neutral"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">trending_up</span></body></html> */
	TRENDING_UP("trending_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">trip_origin</span></body></html> */
	TRIP_ORIGIN("trip_origin"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">trolley</span></body></html> */
	TROLLEY("trolley"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">troubleshoot</span></body></html> */
	TROUBLESHOOT("troubleshoot"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">try</span></body></html> */
	TRY("try"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tsunami</span></body></html> */
	TSUNAMI("tsunami"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tty</span></body></html> */
	TTY("tty"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tune</span></body></html> */
	TUNE("tune"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tungsten</span></body></html> */
	TUNGSTEN("tungsten"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turn_left</span></body></html> */
	TURN_LEFT("turn_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turn_right</span></body></html> */
	TURN_RIGHT("turn_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turn_sharp_left</span></body></html> */
	TURN_SHARP_LEFT("turn_sharp_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turn_sharp_right</span></body></html> */
	TURN_SHARP_RIGHT("turn_sharp_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turn_slight_left</span></body></html> */
	TURN_SLIGHT_LEFT("turn_slight_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turn_slight_right</span></body></html> */
	TURN_SLIGHT_RIGHT("turn_slight_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turned_in</span></body></html> */
	TURNED_IN("turned_in"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">turned_in_not</span></body></html> */
	TURNED_IN_NOT("turned_in_not"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tv</span></body></html> */
	TV("tv"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">tv_off</span></body></html> */
	TV_OFF("tv_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">two_wheeler</span></body></html> */
	TWO_WHEELER("two_wheeler"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">type_specimen</span></body></html> */
	TYPE_SPECIMEN("type_specimen"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">u_turn_left</span></body></html> */
	U_TURN_LEFT("u_turn_left"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">u_turn_right</span></body></html> */
	U_TURN_RIGHT("u_turn_right"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">umbrella</span></body></html> */
	UMBRELLA("umbrella"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unarchive</span></body></html> */
	UNARCHIVE("unarchive"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">undo</span></body></html> */
	UNDO("undo"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unfold_less</span></body></html> */
	UNFOLD_LESS("unfold_less"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unfold_less_double</span></body></html> */
	UNFOLD_LESS_DOUBLE("unfold_less_double"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unfold_more</span></body></html> */
	UNFOLD_MORE("unfold_more"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unfold_more_double</span></body></html> */
	UNFOLD_MORE_DOUBLE("unfold_more_double"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unpublished</span></body></html> */
	UNPUBLISHED("unpublished"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">unsubscribe</span></body></html> */
	UNSUBSCRIBE("unsubscribe"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">upcoming</span></body></html> */
	UPCOMING("upcoming"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">update</span></body></html> */
	UPDATE("update"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">update_disabled</span></body></html> */
	UPDATE_DISABLED("update_disabled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">upgrade</span></body></html> */
	UPGRADE("upgrade"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">upload</span></body></html> */
	UPLOAD("upload"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">upload_file</span></body></html> */
	UPLOAD_FILE("upload_file"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">usb</span></body></html> */
	USB("usb"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">usb_off</span></body></html> */
	USB_OFF("usb_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vaccines</span></body></html> */
	VACCINES("vaccines"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vape_free</span></body></html> */
	VAPE_FREE("vape_free"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vaping_rooms</span></body></html> */
	VAPING_ROOMS("vaping_rooms"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">verified</span></body></html> */
	VERIFIED("verified"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">verified_user</span></body></html> */
	VERIFIED_USER("verified_user"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_align_bottom</span></body></html> */
	VERTICAL_ALIGN_BOTTOM("vertical_align_bottom"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_align_center</span></body></html> */
	VERTICAL_ALIGN_CENTER("vertical_align_center"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_align_top</span></body></html> */
	VERTICAL_ALIGN_TOP("vertical_align_top"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_distribute</span></body></html> */
	VERTICAL_DISTRIBUTE("vertical_distribute"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_shades</span></body></html> */
	VERTICAL_SHADES("vertical_shades"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_shades_closed</span></body></html> */
	VERTICAL_SHADES_CLOSED("vertical_shades_closed"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vertical_split</span></body></html> */
	VERTICAL_SPLIT("vertical_split"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vibration</span></body></html> */
	VIBRATION("vibration"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_call</span></body></html> */
	VIDEO_CALL("video_call"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_camera_back</span></body></html> */
	VIDEO_CAMERA_BACK("video_camera_back"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_camera_front</span></body></html> */
	VIDEO_CAMERA_FRONT("video_camera_front"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_chat</span></body></html> */
	VIDEO_CHAT("video_chat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_collection</span></body></html> */
	VIDEO_COLLECTION("video_collection"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_file</span></body></html> */
	VIDEO_FILE("video_file"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_label</span></body></html> */
	VIDEO_LABEL("video_label"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_library</span></body></html> */
	VIDEO_LIBRARY("video_library"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_settings</span></body></html> */
	VIDEO_SETTINGS("video_settings"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">video_stable</span></body></html> */
	VIDEO_STABLE("video_stable"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">videocam</span></body></html> */
	VIDEOCAM("videocam"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">videocam_off</span></body></html> */
	VIDEOCAM_OFF("videocam_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">videogame_asset</span></body></html> */
	VIDEOGAME_ASSET("videogame_asset"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">videogame_asset_off</span></body></html> */
	VIDEOGAME_ASSET_OFF("videogame_asset_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_agenda</span></body></html> */
	VIEW_AGENDA("view_agenda"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_array</span></body></html> */
	VIEW_ARRAY("view_array"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_carousel</span></body></html> */
	VIEW_CAROUSEL("view_carousel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_column</span></body></html> */
	VIEW_COLUMN("view_column"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_comfortable</span></body></html> */
	VIEW_COMFORTABLE("view_comfortable"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_comfy</span></body></html> */
	VIEW_COMFY("view_comfy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_comfy_alt</span></body></html> */
	VIEW_COMFY_ALT("view_comfy_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_compact</span></body></html> */
	VIEW_COMPACT("view_compact"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_compact_alt</span></body></html> */
	VIEW_COMPACT_ALT("view_compact_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_cozy</span></body></html> */
	VIEW_COZY("view_cozy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_day</span></body></html> */
	VIEW_DAY("view_day"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_headline</span></body></html> */
	VIEW_HEADLINE("view_headline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_in_ar</span></body></html> */
	VIEW_IN_AR("view_in_ar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_kanban</span></body></html> */
	VIEW_KANBAN("view_kanban"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_list</span></body></html> */
	VIEW_LIST("view_list"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_module</span></body></html> */
	VIEW_MODULE("view_module"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_quilt</span></body></html> */
	VIEW_QUILT("view_quilt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_sidebar</span></body></html> */
	VIEW_SIDEBAR("view_sidebar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_stream</span></body></html> */
	VIEW_STREAM("view_stream"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_timeline</span></body></html> */
	VIEW_TIMELINE("view_timeline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">view_week</span></body></html> */
	VIEW_WEEK("view_week"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vignette</span></body></html> */
	VIGNETTE("vignette"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">villa</span></body></html> */
	VILLA("villa"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">visibility</span></body></html> */
	VISIBILITY("visibility"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">visibility_off</span></body></html> */
	VISIBILITY_OFF("visibility_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">voice_chat</span></body></html> */
	VOICE_CHAT("voice_chat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">voice_over_off</span></body></html> */
	VOICE_OVER_OFF("voice_over_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">voicemail</span></body></html> */
	VOICEMAIL("voicemail"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volcano</span></body></html> */
	VOLCANO("volcano"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volume_down</span></body></html> */
	VOLUME_DOWN("volume_down"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volume_down_alt</span></body></html> */
	VOLUME_DOWN_ALT("volume_down_alt"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volume_mute</span></body></html> */
	VOLUME_MUTE("volume_mute"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volume_off</span></body></html> */
	VOLUME_OFF("volume_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volume_up</span></body></html> */
	VOLUME_UP("volume_up"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">volunteer_activism</span></body></html> */
	VOLUNTEER_ACTIVISM("volunteer_activism"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vpn_key</span></body></html> */
	VPN_KEY("vpn_key"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vpn_key_off</span></body></html> */
	VPN_KEY_OFF("vpn_key_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vpn_lock</span></body></html> */
	VPN_LOCK("vpn_lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">vrpano</span></body></html> */
	VRPANO("vrpano"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wallet</span></body></html> */
	WALLET("wallet"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wallet_giftcard</span></body></html> */
	WALLET_GIFTCARD("wallet_giftcard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wallet_membership</span></body></html> */
	WALLET_MEMBERSHIP("wallet_membership"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wallet_travel</span></body></html> */
	WALLET_TRAVEL("wallet_travel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wallpaper</span></body></html> */
	WALLPAPER("wallpaper"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">warehouse</span></body></html> */
	WAREHOUSE("warehouse"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">warning</span></body></html> */
	WARNING("warning"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">warning_amber</span></body></html> */
	WARNING_AMBER("warning_amber"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wash</span></body></html> */
	WASH("wash"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">watch</span></body></html> */
	WATCH("watch"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">watch_later</span></body></html> */
	WATCH_LATER("watch_later"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">watch_off</span></body></html> */
	WATCH_OFF("watch_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">water</span></body></html> */
	WATER("water"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">water_damage</span></body></html> */
	WATER_DAMAGE("water_damage"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">water_drop</span></body></html> */
	WATER_DROP("water_drop"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">waterfall_chart</span></body></html> */
	WATERFALL_CHART("waterfall_chart"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">waves</span></body></html> */
	WAVES("waves"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">waving_hand</span></body></html> */
	WAVING_HAND("waving_hand"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_auto</span></body></html> */
	WB_AUTO("wb_auto"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_cloudy</span></body></html> */
	WB_CLOUDY("wb_cloudy"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_incandescent</span></body></html> */
	WB_INCANDESCENT("wb_incandescent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_iridescent</span></body></html> */
	WB_IRIDESCENT("wb_iridescent"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_shade</span></body></html> */
	WB_SHADE("wb_shade"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_sunny</span></body></html> */
	WB_SUNNY("wb_sunny"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_twighlight</span></body></html> */
	WB_TWIGHLIGHT("wb_twighlight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wb_twilight</span></body></html> */
	WB_TWILIGHT("wb_twilight"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wc</span></body></html> */
	WC("wc"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">web</span></body></html> */
	WEB("web"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">web_asset</span></body></html> */
	WEB_ASSET("web_asset"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">web_asset_off</span></body></html> */
	WEB_ASSET_OFF("web_asset_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">web_stories</span></body></html> */
	WEB_STORIES("web_stories"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">webhook</span></body></html> */
	WEBHOOK("webhook"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wechat</span></body></html> */
	WECHAT("wechat"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">weekend</span></body></html> */
	WEEKEND("weekend"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">west</span></body></html> */
	WEST("west"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">whatshot</span></body></html> */
	WHATSHOT("whatshot"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wheelchair_pickup</span></body></html> */
	WHEELCHAIR_PICKUP("wheelchair_pickup"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">where_to_vote</span></body></html> */
	WHERE_TO_VOTE("where_to_vote"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">widgets</span></body></html> */
	WIDGETS("widgets"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">width_full</span></body></html> */
	WIDTH_FULL("width_full"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">width_normal</span></body></html> */
	WIDTH_NORMAL("width_normal"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">width_wide</span></body></html> */
	WIDTH_WIDE("width_wide"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi</span></body></html> */
	WIFI("wifi"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_1_bar</span></body></html> */
	WIFI_1_BAR("wifi_1_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_2_bar</span></body></html> */
	WIFI_2_BAR("wifi_2_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_calling</span></body></html> */
	WIFI_CALLING("wifi_calling"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_calling_3</span></body></html> */
	WIFI_CALLING_3("wifi_calling_3"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_channel</span></body></html> */
	WIFI_CHANNEL("wifi_channel"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_find</span></body></html> */
	WIFI_FIND("wifi_find"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_lock</span></body></html> */
	WIFI_LOCK("wifi_lock"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_off</span></body></html> */
	WIFI_OFF("wifi_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_password</span></body></html> */
	WIFI_PASSWORD("wifi_password"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_protected_setup</span></body></html> */
	WIFI_PROTECTED_SETUP("wifi_protected_setup"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_tethering</span></body></html> */
	WIFI_TETHERING("wifi_tethering"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_tethering_error</span></body></html> */
	WIFI_TETHERING_ERROR("wifi_tethering_error"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_tethering_error_rounded</span></body></html> */
	WIFI_TETHERING_ERROR_ROUNDED("wifi_tethering_error_rounded"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wifi_tethering_off</span></body></html> */
	WIFI_TETHERING_OFF("wifi_tethering_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wind_power</span></body></html> */
	WIND_POWER("wind_power"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">window</span></body></html> */
	WINDOW("window"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wine_bar</span></body></html> */
	WINE_BAR("wine_bar"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">woman</span></body></html> */
	WOMAN("woman"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">woman_2</span></body></html> */
	WOMAN_2("woman_2"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">woo_commerce</span></body></html> */
	WOO_COMMERCE("woo_commerce"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wordpress</span></body></html> */
	WORDPRESS("wordpress"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">work</span></body></html> */
	WORK("work"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">work_history</span></body></html> */
	WORK_HISTORY("work_history"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">work_off</span></body></html> */
	WORK_OFF("work_off"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">work_outline</span></body></html> */
	WORK_OUTLINE("work_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">workspace_premium</span></body></html> */
	WORKSPACE_PREMIUM("workspace_premium"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">workspaces</span></body></html> */
	WORKSPACES("workspaces"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">workspaces_filled</span></body></html> */
	WORKSPACES_FILLED("workspaces_filled"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">workspaces_outline</span></body></html> */
	WORKSPACES_OUTLINE("workspaces_outline"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wrap_text</span></body></html> */
	WRAP_TEXT("wrap_text"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wrong_location</span></body></html> */
	WRONG_LOCATION("wrong_location"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">wysiwyg</span></body></html> */
	WYSIWYG("wysiwyg"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">yard</span></body></html> */
	YARD("yard"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">youtube_searched_for</span></body></html> */
	YOUTUBE_SEARCHED_FOR("youtube_searched_for"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">zoom_in</span></body></html> */
	ZOOM_IN("zoom_in"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">zoom_in_map</span></body></html> */
	ZOOM_IN_MAP("zoom_in_map"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">zoom_out</span></body></html> */
	ZOOM_OUT("zoom_out"),
	/** <html><head><link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></head><body><span class="material-icons">zoom_out_map</span></body></html> */
	ZOOM_OUT_MAP("zoom_out_map"),
	// @formatter:on
	;
	
    private final String cssClass;

    IconType(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static IconType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, IconType.class, DEFAULT);
    }
}
