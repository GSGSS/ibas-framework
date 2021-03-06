package org.colorcoding.ibas.bobas.rule.common;

import org.colorcoding.ibas.bobas.core.IPropertyInfo;
import org.colorcoding.ibas.bobas.data.Decimal;
import org.colorcoding.ibas.bobas.i18n.I18N;
import org.colorcoding.ibas.bobas.rule.BusinessRuleCollection;

/**
 * 业务规则-集合元素属性求和
 * 
 * @author Niuren.Zhu
 *
 */
public class BusinessRuleSumElements extends BusinessRuleCollection {

	public BusinessRuleSumElements() {
		this.setName(I18N.prop("msg_bobas_business_rule_sum_elements"));
	}

	/**
	 * 构造方法
	 * 
	 * @param affectedProperty
	 *            属性-求和
	 * @param collectionProperty
	 *            属性-集合
	 * @param summingProperty
	 *            属性-被求和
	 */
	public BusinessRuleSumElements(IPropertyInfo<Decimal> affectedProperty, IPropertyInfo<?> collectionProperty,
			IPropertyInfo<Decimal> summingProperty) {
		this();
		this.setCollection(collectionProperty);
		this.setResult(affectedProperty);
		this.setSumming(summingProperty);
		// 要输入的参数
		this.getInputProperties().add(this.getSumming());
		// 结果
		this.getAffectedProperties().add(this.getResult());
	}

	private IPropertyInfo<Decimal> result;

	public final IPropertyInfo<Decimal> getResult() {
		return result;
	}

	public final void setResult(IPropertyInfo<Decimal> result) {
		this.result = result;
	}

	private IPropertyInfo<Decimal> summing;

	public final IPropertyInfo<Decimal> getSumming() {
		return summing;
	}

	public final void setSumming(IPropertyInfo<Decimal> summing) {
		this.summing = summing;
	}

	@Override
	protected void execute(BusinessRuleContext context) throws Exception {
		Decimal result = Decimal.ZERO;
		Object[] values = context.getInputValues().get(this.getSumming());
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				Object value = values[i];
				if (value instanceof Decimal) {
					result = result.add((Decimal) value);
				}
			}
		}
		context.getOutputValues().put(this.getResult(), result);
	}

}
