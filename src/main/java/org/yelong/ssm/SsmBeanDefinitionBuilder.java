/**
 * 
 */
package org.yelong.ssm;

import org.springframework.beans.factory.config.BeanDefinition;
import org.yelong.core.annotation.Nullable;

/**
 * ssm框架中BeanDefinition 的构建。
 * 构建后将注入spring容器。
 * @author PengFei
 */
public interface SsmBeanDefinitionBuilder {

	/**
	 * @return modelConfiguration BeanDefinition
	 */
	BeanDefinition buidlerModelConfiguration();
	
	/**
	 * @return modelService BeanDefinition
	 */
	BeanDefinition buidlerModelService();
	
	/**
	 * @return MyBatisBaseDataBaseOperation BeanDefinition
	 */
	BeanDefinition buidlerMyBatisBaseDataBaseOperation();
	
	/**
	 * @return MyBatisJdbcBaseDataBaseOperation BeanDefinition
	 */
	@Nullable
	BeanDefinition buidlerMyBatisJdbcBaseDataBaseOperation();
	
	/**
	 * 设置配置,此方法优先被调用
	 * @param ssmModelProperties
	 */
	void setSsmModelProperties(SsmModelProperties ssmModelProperties);
	
}
