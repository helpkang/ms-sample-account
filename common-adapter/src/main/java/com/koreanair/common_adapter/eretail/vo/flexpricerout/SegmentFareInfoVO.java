/*
 * Copyright 2011-2019 Koreanair.
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
package com.koreanair.common_adapter.eretail.vo.flexpricerout;

import lombok.Data;

/**
 * <pre>
 * Created by bdlee on 2019. 10. 8.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 10. 8.
 */
@Data
public class SegmentFareInfoVO {
	private String segmentId = "";
	private String fareClass = "";
	private String rbd = "";	// bookingClass
	private String cabinClass = "";
	private String fareFamily = "";
	private String fareType = ""; // RP : Public Fare
	private String corporate = "";
}
