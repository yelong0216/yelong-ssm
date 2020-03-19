/**
 * 
 */
package org.yelong.ssm.service;

import org.springframework.transaction.annotation.Transactional;
import org.yelong.core.jdbc.sql.condition.ConditionSqlFragment;
import org.yelong.core.jdbc.sql.condition.combination.CombinationConditionSqlFragment;
import org.yelong.core.jdbc.sql.sort.SortSqlFragment;
import org.yelong.core.model.service.ModelService;

/**
 * @author PengFei
 */
@Transactional
public abstract class BaseSsmModelService {
	
	/**
	 * 获取组合条件
	 * @param modelService
	 * @return
	 * @deprecated 使用SqlModel可以更好的构建sql
	 */
	@Deprecated
	public CombinationConditionSqlFragment createCombinationSqlCondition(ModelService modelService) {
		return modelService.getModelConfiguration().getModelSqlFragmentFactory().createCombinationConditionSqlFragment();
	}
	
	/**
	 * 创建简单条件
	 * @param modelService
	 * @param condition
	 * @param params
	 * @return
	 * @deprecated 使用SqlModel可以更好的构建sql
	 */
	public ConditionSqlFragment createSimpleSqlCondition(ModelService modelService,String condition,Object ... params) {
		return modelService.getModelConfiguration().getModelSqlFragmentFactory().createConditionSqlFragment(condition, params);
	}
	
	/**
	 * 创建排序片段
	 * @param modelService
	 * @return
	 * @deprecated 使用SqlModel可以更好的构建sql
	 */
	public SortSqlFragment createSortSqlFragment(ModelService modelService) {
		return modelService.getModelConfiguration().getModelSqlFragmentFactory().createSortSqlFragment();
	}
	
}
