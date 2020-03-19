/**
 * 
 */
package org.yelong.ssm.service;

import org.yelong.core.model.ModelConfiguration;
import org.yelong.support.orm.mybaits.mapper.MyBatisBaseDataBaseOperation;
import org.yelong.support.orm.mybaits.pagehelper.AbstractPageHelperModelService;

/**
 * 默认的SsmModelService实现。
 * @author PengFei
 */
public class SsmModelServiceImpl extends AbstractPageHelperModelService{

	private MyBatisBaseDataBaseOperation myBatisBaseDataBaseOperation;
	
	public SsmModelServiceImpl(ModelConfiguration modelConfiguration,
			MyBatisBaseDataBaseOperation myBatisBaseDataBaseOperation) {
		super(modelConfiguration);
		this.myBatisBaseDataBaseOperation = myBatisBaseDataBaseOperation;
	}

	@Override
	public MyBatisBaseDataBaseOperation getMyBatisBaseDataBaseOperation() {
		return myBatisBaseDataBaseOperation;
	}
	
}
