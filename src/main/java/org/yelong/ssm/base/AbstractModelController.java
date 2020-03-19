/**
 * 
 */
package org.yelong.ssm.base;

import org.yelong.core.jdbc.sql.condition.ConditionSqlFragment;
import org.yelong.core.jdbc.sql.condition.combination.CombinationConditionSqlFragment;
import org.yelong.core.jdbc.sql.sort.SortSqlFragment;
import org.yelong.core.model.service.ModelService;
import org.yelong.support.spring.mvc.controller.AbstractSpringMvcController;

/**
 * @author PengFei
 * @deprecated 使用SqlModel可以更好的构建sql
 */
@Deprecated
public abstract class AbstractModelController extends AbstractSpringMvcController{
	
	/**
	 * 获取组合条件
	 * @param modelService
	 * @return
	 */
	public CombinationConditionSqlFragment createCombinationSqlCondition(ModelService modelService) {
		return modelService.getModelConfiguration().getModelSqlFragmentFactory().createCombinationConditionSqlFragment();
	}
	
	/**
	 * 创建简单条件
	 * @param modelService
	 * @param condition
	 * @param params
	 * @return
	 */
	public ConditionSqlFragment createSimpleSqlCondition(ModelService modelService,String condition,Object ... params) {
		return modelService.getModelConfiguration().getModelSqlFragmentFactory().createConditionSqlFragment(condition, params);
	}
	
	/**
	 * 创建排序片段
	 * @param modelService
	 * @return
	 */
	public SortSqlFragment createSortSqlFragment(ModelService modelService) {
		return modelService.getModelConfiguration().getModelSqlFragmentFactory().createSortSqlFragment();
	}
	
}
