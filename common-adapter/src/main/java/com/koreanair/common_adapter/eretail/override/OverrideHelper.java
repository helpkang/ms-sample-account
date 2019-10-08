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

import com.koreanair.common_adapter.utils.JAXBFactory;
import com.koreanair.common_adapter.utils.SchemaLocation;
import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput;
import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput.EMBEDDEDTRANSACTION;

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
public class OverrideHelper {

	public OverrideInput getKeepAliveOverride() {
		OverrideInput overrideInupt = new OverrideInput();
		overrideInupt.setTRANSACTIONID("Override");
		overrideInupt.setSITE("CBFICBFI");
		overrideInupt.setLANGUAGE("GB");
		return overrideInupt;
	}

	public OverrideInput getEmbeddedOverrideInput(Object embeddedObject) {
		OverrideInput overrideInupt = new OverrideInput();
		overrideInupt.setTRANSACTIONID("Override");
		overrideInupt.setSITE("CBFICBFI");
		overrideInupt.setLANGUAGE("GB");
		overrideInupt.setSOSITEOFFICEID("SELKE08DM");
		overrideInupt.setSOSITEMINAVAILDATESPAN("N30");
		overrideInupt.setSOSITENBFLIGHTSAVAIL("30");
		overrideInupt.setSOSITEPOINTOFSALE("SEL");
		overrideInupt.setSOSITEPOINTOFTICKETING("SEL");
		overrideInupt.setSOSITEMINIMALTIME("N30");
		overrideInupt.setSOSITEAPIV2SERVER("194.156.170.78");
		overrideInupt.setSOSITEAPIV2SERVERUSERID("GUEST");
		overrideInupt.setSOSITEAPIV2SERVERPWD("TAZ");

		log.debug("embedded call");
		EMBEDDEDTRANSACTION embedded = new EMBEDDEDTRANSACTION();
		String schemaLocation = SchemaLocation.get(embeddedObject);
		embedded.setSchemaRef(schemaLocation);
		embedded.getContent().add(embeddedObject);
		overrideInupt.setEMBEDDEDTRANSACTION(embedded);

		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEMANUALETKTCMD", "TTP/ET"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESISERVERIP", "193.23.185.67"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESISERVERPORT", "18006"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESISAP", "1ASIXJCPU"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESIUSER", "UNSET"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESIPASSWORD", "UNSET"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESI1AXMLFROM", "SEPJCP"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITECORPORATEID", "SEP-UAT"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEAPIV2SERVERPORT", "20002"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEPTCCONFVALIDATION", "FALSE"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESENDFOIDAIRLINE", "FALSE"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEMAXRESNUMATTEMPTS", "0"));

		return overrideInupt;
	}
}
