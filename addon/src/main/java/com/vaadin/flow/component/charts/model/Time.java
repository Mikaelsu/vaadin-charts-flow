package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2018 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import javax.annotation.Generated;

/**
 * Time options that can apply globally or to individual charts. These settings
 * affect how `datetime` axes are laid out, how tooltips are formatted, how
 * series [pointIntervalUnit](#plotOptions.series.pointIntervalUnit) works and
 * how the Highstock range selector handles time. The common use case is that
 * all charts in the same Highcharts object share the same time settings, in
 * which case the global settings are set using `setOptions`. ```js // Apply
 * time settings globally Highcharts.setOptions({ time: { timezone:
 * 'Europe/London' } }); // Apply time settings by instance var chart =
 * Highcharts.chart('container', { time: { timezone: 'America/New_York' },
 * series: [{ data: [1, 4, 3, 5] }] }); // Use the Time object console.log(
 * 'Current time in New York', chart.time.dateFormat('%Y-%m-%d %H:%M:%S',
 * Date.now()) ); ``` Since v6.0.5, the time options were moved from the
 * `global` obect to the `time` object, and time options can be set on each
 * individual chart.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Time extends AbstractConfigurationObject {

	private String timezone;
	private Number timezoneOffset;
	private Boolean useUTC;

	public Time() {
	}

	/**
	 * @see #setTimezone(String)
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * Requires [moment.js](http://momentjs.com/). If the timezone option is
	 * specified, it creates a default
	 * [getTimezoneOffset](#time.getTimezoneOffset) function that looks up the
	 * specified timezone in moment.js. If moment.js is not included, this
	 * throws a Highcharts error in the console, but does not crash the chart.
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * @see #setTimezoneOffset(Number)
	 */
	public Number getTimezoneOffset() {
		return timezoneOffset;
	}

	/**
	 * The timezone offset in minutes. Positive values are west, negative values
	 * are east of UTC, as in the ECMAScript
	 * [getTimezoneOffset](https://developer
	 * .mozilla.org/en-US/docs/Web/JavaScript
	 * /Reference/Global_Objects/Date/getTimezoneOffset) method. Use this to
	 * display UTC based data in a predefined time zone.
	 */
	public void setTimezoneOffset(Number timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	/**
	 * @see #setUseUTC(Boolean)
	 */
	public Boolean getUseUTC() {
		return useUTC;
	}

	/**
	 * Whether to use UTC time for axis scaling, tickmark placement and time
	 * display in `Highcharts.dateFormat`. Advantages of using UTC is that the
	 * time displays equally regardless of the user agent's time zone settings.
	 * Local time can be used when the data is loaded in real time or when
	 * correct Daylight Saving Time transitions are required.
	 */
	public void setUseUTC(Boolean useUTC) {
		this.useUTC = useUTC;
	}
}