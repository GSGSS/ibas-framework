package org.colorcoding.ibas.bobas.test.core;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.colorcoding.ibas.bobas.core.BusinessObjectBase;
import org.colorcoding.ibas.bobas.core.IPropertyInfo;
import org.colorcoding.ibas.bobas.data.DateTime;
import org.colorcoding.ibas.bobas.data.Decimal;
import org.colorcoding.ibas.bobas.data.emDocumentStatus;
import org.colorcoding.ibas.bobas.mapping.DbField;
import org.colorcoding.ibas.bobas.mapping.DbFieldType;

@XmlRootElement(name = "Order", namespace = "httpL//ibas.club/bobas/test")
public class Order extends BusinessObjectBase<Order> {

	private static final long serialVersionUID = 4771656989360317386L;

	/**
	 * 当前类型 java的泛型是擦除机制，不能在运行期间获取到泛型信息
	 */
	private final static Class<?> MY_CLASS = Order.class;
	/**
	 * 数据库表
	 */
	public final static String DB_TABLE_NAME = "CC_SM_OPOR";

	/**
	 * 业务对象名称
	 */
	public static final String BUSINESS_OBJECT_NAME = "SalesOrder";

	/**
	 * 属性名称-凭证编号
	 */
	private static final String PROPERTY_DOCENTRY_NAME = "DocEntry";

	/**
	 * 凭证编号 属性
	 */
	@DbField(name = "DocEntry", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = true)
	public static final IPropertyInfo<Integer> PROPERTY_DOCENTRY = registerProperty(PROPERTY_DOCENTRY_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-凭证编号
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCENTRY_NAME)
	public final Integer getDocEntry() {
		return this.getProperty(PROPERTY_DOCENTRY);
	}

	/**
	 * 设置-凭证编号
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocEntry(Integer value) {
		this.setProperty(PROPERTY_DOCENTRY, value);
	}

	/**
	 * 属性名称-客户代码
	 */
	private static final String PROPERTY_CUSTOMERCODE_NAME = "CustomerCode";

	/**
	 * 客户代码 属性
	 */
	@DbField(name = "CardCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_CUSTOMERCODE = registerProperty(PROPERTY_CUSTOMERCODE_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-客户代码
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CUSTOMERCODE_NAME)
	public final String getCustomerCode() {
		return this.getProperty(PROPERTY_CUSTOMERCODE);
	}

	/**
	 * 设置-客户代码
	 * 
	 * @param value
	 *            值
	 */
	public final void setCustomerCode(String value) {
		this.setProperty(PROPERTY_CUSTOMERCODE, value);
	}

	/**
	 * 属性名称-凭证日期
	 */
	private static final String PROPERTY_DOCUMENTDATE_NAME = "DocumentDate";

	/**
	 * 凭证日期 属性
	 */
	@DbField(name = "TaxDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<DateTime> PROPERTY_DOCUMENTDATE = registerProperty(PROPERTY_DOCUMENTDATE_NAME,
			DateTime.class, MY_CLASS);

	/**
	 * 获取-凭证日期
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTDATE_NAME)
	public final DateTime getDocumentDate() {
		return this.getProperty(PROPERTY_DOCUMENTDATE);
	}

	/**
	 * 设置-凭证日期
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentDate(DateTime value) {
		this.setProperty(PROPERTY_DOCUMENTDATE, value);
	}

	/**
	 * 属性名称-单据状态
	 */
	private static final String PROPERTY_DOCUMENTSTATUS_NAME = "DocumentStatus";

	/**
	 * 单据状态 属性
	 */
	@DbField(name = "DocStatus", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emDocumentStatus> PROPERTY_DOCUMENTSTATUS = registerProperty(
			PROPERTY_DOCUMENTSTATUS_NAME, emDocumentStatus.class, MY_CLASS);

	/**
	 * 获取-单据状态
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTSTATUS_NAME)
	public final emDocumentStatus getDocumentStatus() {
		return this.getProperty(PROPERTY_DOCUMENTSTATUS);
	}

	/**
	 * 设置-单据状态
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentStatus(emDocumentStatus value) {
		this.setProperty(PROPERTY_DOCUMENTSTATUS, value);
	}

	/**
	 * 属性名称-已激活的
	 */
	private static final String PROPERTY_ACTIVATED_NAME = "Activated";

	/**
	 * 已激活的 属性
	 */
	@DbField(name = "Activated", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Boolean> PROPERTY_ACTIVATED = registerProperty(PROPERTY_ACTIVATED_NAME,
			Boolean.class, MY_CLASS);

	/**
	 * 获取-已激活的
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_ACTIVATED_NAME)
	public final Boolean getActivated() {
		return this.getProperty(PROPERTY_ACTIVATED);
	}

	/**
	 * 设置-已激活的
	 * 
	 * @param value
	 *            值
	 */
	public final void setActivated(Boolean value) {
		this.setProperty(PROPERTY_ACTIVATED, value);
	}

	/**
	 * 属性名称-单据总计
	 */
	private static final String PROPERTY_DOCUMENTTOTAL_NAME = "DocumentTotal";

	/**
	 * 单据总计 属性
	 */
	@DbField(name = "DocTotal", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_DOCUMENTTOTAL = registerProperty(PROPERTY_DOCUMENTTOTAL_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-单据总计
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTTOTAL_NAME)
	public final Decimal getDocumentTotal() {
		return this.getProperty(PROPERTY_DOCUMENTTOTAL);
	}

	/**
	 * 设置-单据总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentTotal(Decimal value) {
		this.setProperty(PROPERTY_DOCUMENTTOTAL, value);
	}

	@DbField(name = "Suppler", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public final static IPropertyInfo<String> SupplerProperty = registerProperty("Suppler", String.class, MY_CLASS);

	/**
	 * 供应商
	 * 
	 * @return
	 */
	@XmlElement(name = "Suppler")
	public final String getSuppler() {
		return this.getProperty(SupplerProperty);
	}

	public final void setSuppler(String value) {
		this.setProperty(SupplerProperty, value);
	}

	@Override
	public String toString(String type) {
		return this.toString();
	}

	@Override
	public void markOld(boolean recursive) {
		this.markOld();
	}

}
