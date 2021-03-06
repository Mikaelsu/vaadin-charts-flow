package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2019 Vaadin Ltd
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
 * <p>
 * Options for the series data labels, appearing next to each data point.
 * </p>
 * 
 * <p>
 * In <a
 * href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
 * >styled mode</a>, the data labels can be styled wtih the
 * <code>.highcharts-data-label-box</code> and
 * <code>.highcharts-data-label</code> class names (<a href=
 * "http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels"
 * >see example</a>).
 * </p>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DataLabels extends AbstractDataLabels {

	private HorizontalAlign align;
	private Boolean allowOverlap;
	private String className;
	private Boolean crop;
	private Boolean defer;
	private Boolean enabled;
	private String format;
	private String _fn_formatter;
	private Boolean inside;
	private String overflow;
	private Number padding;
	private Number rotation;
	private Boolean shadow;
	private Shape shape;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;
	private Number zIndex;
	private Number connectorPadding;
	private Number distance;
	private Boolean softConnector;

	public DataLabels() {
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * The alignment of the data label compared to the point. If
	 * <code>right</code>, the right side of the label should be touching the
	 * point. For points with an extent, like columns, the alignments also
	 * dictates how to align it inside the box, as given with the <a
	 * href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be
	 * one of "left", "center" or "right".
	 * <p>
	 * Defaults to: center
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setAllowOverlap(Boolean)
	 */
	public Boolean getAllowOverlap() {
		return allowOverlap;
	}

	/**
	 * Whether to allow data labels to overlap. To make the labels less
	 * sensitive for overlapping, the <a
	 * href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can
	 * be set to 0.
	 * <p>
	 * Defaults to: false
	 */
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name for the data label. Particularly in <a href=
	 * "http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
	 * >styled mode</a>, this can be used to give each series' or point's data
	 * label unique styling. In addition to this option, a default color class
	 * name is added so that we can give the labels a <a href=
	 * "http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/"
	 * >contrast text shadow</a>.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setCrop(Boolean)
	 */
	public Boolean getCrop() {
		return crop;
	}

	/**
	 * Whether to hide data labels that are outside the plot area. By default,
	 * the data label is moved inside the plot area according to the <a
	 * href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
	 * <p>
	 * Defaults to: true
	 */
	public void setCrop(Boolean crop) {
		this.crop = crop;
	}

	/**
	 * @see #setDefer(Boolean)
	 */
	public Boolean getDefer() {
		return defer;
	}

	/**
	 * Whether to defer displaying the data labels until the initial series
	 * animation has finished.
	 * <p>
	 * Defaults to: true
	 */
	public void setDefer(Boolean defer) {
		this.defer = defer;
	}

	public DataLabels(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the data labels.
	 * <p>
	 * Defaults to: false
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFormat(String)
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * A <a href=
	 * "http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting"
	 * >format string</a> for the data label. Available variables are the same
	 * as for <code>formatter</code>.
	 * <p>
	 * Defaults to: {y}
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	public String getFormatter() {
		return _fn_formatter;
	}

	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	/**
	 * @see #setInside(Boolean)
	 */
	public Boolean getInside() {
		return inside;
	}

	/**
	 * For points with an extent, like columns, whether to align the data label
	 * inside the box or to the actual value point. Defaults to
	 * <code>false</code> in most cases, <code>true</code> in stacked columns.
	 */
	public void setInside(Boolean inside) {
		this.inside = inside;
	}

	/**
	 * @see #setOverflow(String)
	 */
	public String getOverflow() {
		return overflow;
	}

	/**
	 * How to handle data labels that flow outside the plot area. The default is
	 * <code>justify</code>, which aligns them inside the plot area. For columns
	 * and bars, this means it will be moved inside the bar. To display data
	 * labels outside the plot area, set <code>crop</code> to <code>false</code>
	 * and <code>overflow</code> to <code>"none"</code>.
	 * <p>
	 * Defaults to: justify
	 */
	public void setOverflow(String overflow) {
		this.overflow = overflow;
	}

	/**
	 * @see #setPadding(Number)
	 */
	public Number getPadding() {
		return padding;
	}

	/**
	 * When either the <code>borderWidth</code> or the
	 * <code>backgroundColor</code> is set, this is the padding within the box.
	 * <p>
	 * Defaults to: 5
	 */
	public void setPadding(Number padding) {
		this.padding = padding;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Text rotation in degrees. Note that due to a more complex structure,
	 * backgrounds, borders and padding will be lost on a rotated data label.
	 * <p>
	 * Defaults to: 0
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * The shadow of the box. Works best with <code>borderWidth</code> or
	 * <code>backgroundColor</code>. Since 2.3 the shadow can be an object
	 * configuration containing <code>color</code>, <code>offsetX</code>,
	 * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
	 * <p>
	 * Defaults to: false
	 */
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}

	/**
	 * @see #setShape(Shape)
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * The name of a symbol to use for the border around the label. Symbols are
	 * predefined functions on the Renderer object.
	 * <p>
	 * Defaults to: square
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * Whether to <a href=
	 * "http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html"
	 * >use HTML</a> to render the labels.
	 * <p>
	 * Defaults to: false
	 */
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * The vertical alignment of a data label. Can be one of <code>top</code>,
	 * <code>middle</code> or <code>bottom</code>. The default value depends on
	 * the data, for instance in a column chart, the label is above positive
	 * values and below negative values.
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The x position offset of the label relative to the point.
	 * <p>
	 * Defaults to: 0
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The y position offset of the label relative to the point.
	 * <p>
	 * Defaults to: -6
	 */
	public void setY(Number y) {
		this.y = y;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index of the data labels. The default Z index puts it above the
	 * series. Use a Z index of 2 to display it behind the series.
	 * <p>
	 * Defaults to: 6
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}

	/**
	 * @see #setConnectorPadding(Number)
	 */
	public Number getConnectorPadding() {
		return connectorPadding;
	}

	/**
	 * The distance from the data label to the connector.
	 * <p>
	 * Defaults to: 5
	 */
	public void setConnectorPadding(Number connectorPadding) {
		this.connectorPadding = connectorPadding;
	}

	/**
	 * @see #setDistance(Number)
	 */
	public Number getDistance() {
		return distance;
	}

	/**
	 * The distance of the data label from the pie's edge. Negative numbers put
	 * the data label on top of the pie slices. Connectors are only shown for
	 * data labels outside the pie.
	 * <p>
	 * Defaults to: 30
	 */
	public void setDistance(Number distance) {
		this.distance = distance;
	}

	/**
	 * @see #setSoftConnector(Boolean)
	 */
	public Boolean getSoftConnector() {
		return softConnector;
	}

	/**
	 * Whether to render the connector as a soft arc or a line with sharp break.
	 * <p>
	 * Defaults to: true
	 */
	public void setSoftConnector(Boolean softConnector) {
		this.softConnector = softConnector;
	}
}
