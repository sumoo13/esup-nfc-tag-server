/**
 * Licensed to ESUP-Portail under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * ESUP-Portail licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esupportail.nfctag.domain;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findDevicesByApplicationEquals",
								"findDevicesByNumeroIdEquals", 
								"findDevicesByEppnInitEquals", 
								"findDevicesByImeiEquals",
								"findDevicesByMacAddressEquals",
								"findDevicesByLocationEquals",
								"findDevicesByEppnInitLike",
								"findDevicesByLocationAndEppnInitAndImeiEquals", 
								"findDevicesByLocationAndEppnInitAndMacAddressEquals" })
public class Device {

    private String numeroId;
   
    private boolean validateAuthWoConfirmation = false;

    private String eppnInit;
    
    private String imei;
    
    private String macAddress;
    
    private String userAgent;
    
    private String location;
    
    @ManyToOne
    private Application application;
    
    public String getApplicationName(){
    	return this.application!=null ? this.application.getName() : "";
    }

}
