/*
 * Copyright 2011-2019 KoreanAir
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.common_adapter.eretail.override;

import javax.xml.soap.SOAPException;

import org.springframework.stereotype.Component;

import com.koreanair.common_adapter.eretail.ERetailBaseAdapter;
import com.koreanair.common_adapter.eretail.connector.ERetailConnector;
import com.koreanair.common_adapter.eretail.connector.ERetailSoapConnectorImpl;
import com.koreanair.external.eretail.vo.common.overrideoutput.OverrideOutput;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * Created by bdlee on 2019. 10. 3.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 10. 3.
 */
@Slf4j
@Component
public class OverrideAdapter extends ERetailBaseAdapter {
	private ERetailConnector retailCon = new ERetailSoapConnectorImpl();	// SOAPMesage 기반 connector
	private OverrideHelper helper = new OverrideHelper();

	public OverrideOutput keepAliveOverride() throws SOAPException {
		Object outObj = retailCon.sendAndReceive(helper.getKeepAliveOverride(), OverrideOutput.class);
		setJsessionid(retailCon.getJsessionId());
		OverrideOutput output = (OverrideOutput) outObj;
		setReturnObject(output);
		return output;
	}

	public static void main(String[] args) {
		try {
			OverrideAdapter adapter = new OverrideAdapter();
			log.debug("{}", adapter.keepAliveOverride());
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
}
