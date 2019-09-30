package com.kal.framework.integration.adaptor.support;

import org.springframework.aop.target.CommonsPoolTargetSource;
import com.kal.framework.integration.connector.AdaptorConnector;

public class AdaptorConnectorImpl implements AdaptorConnector {

	/** First Pool */
	private CommonsPoolTargetSource firstPool;
	
	/** Second Pool */
	private CommonsPoolTargetSource secondPool;
	
	/** 현재 사용중인 Pool Reference Object */
	public CommonsPoolTargetSource currentPool;
	
	/** Fork Point : 분기점 */
	private String forkPoint;
	
	public CommonsPoolTargetSource getFirstAdaptorPool(){
		return firstPool;
	}
	
	public CommonsPoolTargetSource getSecondAdaptorPool(){
		return secondPool;
	}
	
	public void setFirstAdaptorPool(CommonsPoolTargetSource firstPool){
		this.firstPool = firstPool;
	}
	
	public void setSecondAdaptorPool(CommonsPoolTargetSource secondPool){
		this.secondPool = secondPool;
	}
	
	public void setForkPoint(String forkPoint){
		this.forkPoint = forkPoint;
	}
	
	public String getForkPoint(){
		return forkPoint;
	}
	
	@Override
	public Object getAdaptor() throws Exception {
		if(forkPoint.equals("DIRECT")){
			currentPool = firstPool;
			return firstPool.getTarget();
		}
		else{
			currentPool = secondPool;
			return secondPool.getTarget();
		}
	}

	@Override
	public void returnAdaptor(Object usedAdaptor) throws Exception {
		if(forkPoint.equals("DIRECT")){
			firstPool.releaseTarget(usedAdaptor);
			currentPool = firstPool;
		}
		else{
			secondPool.releaseTarget(usedAdaptor);
			currentPool = secondPool;
		}
	}
	
	public void destroy(){
		try{
			firstPool.destroy();
			secondPool.destroy();
			currentPool.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
