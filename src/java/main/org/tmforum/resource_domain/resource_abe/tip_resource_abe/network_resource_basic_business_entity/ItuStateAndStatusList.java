/**
* Network Resource Basic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_9LV.tEJ2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Basic ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.tip_resource_abe.network_resource_basic_business_entity ;

/**
* This data type contains a list of ITU states and statuses. Each elemen 
* t of the list identifies a state or status and provides its relevant v 
* alue.See R_TMF518_NRB_I_0004. 
 @since SID_R16.5
*/ 

public  class ItuStateAndStatusList  {



/**  
* Field M3100CIRCUITPACKTYPE
*/
protected String M3100CIRCUITPACKTYPE ;




/**  
* Field M3100HOLDERSTATUS
*/
protected HolderStatus M3100HOLDERSTATUS ;




/**  
* Field X721ADMINISTRATIVESTATE
*/
protected AdministrativeState X721ADMINISTRATIVESTATE ;




/**  
* Field X721AVAILABILITYSTATUS
*/
protected List<AvailabilityStatus> X721AVAILABILITYSTATUS ;




/**  
* Field X721CONTROLSTATUS
*/
protected List<ControlStatus> X721CONTROLSTATUS ;




/**  
* Field X721OPERATIONALSTATE
*/
protected OperationalState X721OPERATIONALSTATE ;




/**  
* Field X721STATE
*/
protected List<State> X721STATE ;




/**  
* Field X721UNKNOWNSTATUS
*/
protected Boolean X721UNKNOWNSTATUS ;




/**  
* Field X721USAGESTATE
*/
protected UsageState X721USAGESTATE ;


}