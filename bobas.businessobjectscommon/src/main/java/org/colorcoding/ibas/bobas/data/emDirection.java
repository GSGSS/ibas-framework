package org.colorcoding.ibas.bobas.data;

import javax.xml.bind.annotation.XmlType;

import org.colorcoding.ibas.bobas.MyConfiguration;
import org.colorcoding.ibas.bobas.mapping.Value;

/**
 * 方向
 * 
 * @author Niuren.Zhu
 *
 */
@XmlType(name = "emDirection", namespace = MyConfiguration.NAMESPACE_BOBAS_DATA)
public enum emDirection {
	/**
	 * 入
	 */
	@Value("I")
	IN,
	/**
	 * 出
	 */
	@Value("O")
	OUT;

	public int getValue() {
		return this.ordinal();
	}

	public static emDirection forValue(int value) {
		return values()[value];
	}
}
