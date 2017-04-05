/**
* Network Resource Basic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_9LV.tEJ2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Basic ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.tip_resource_abe.network_resource_basic_business_entity ;

/**
* This object class defines the attributes that are common to all resour 
* ce objects used in the MTOSI/MTNM interface. This class should “merge  
* up” into its parent class. There is currently no merge-up stereotype t 
* o direct the implementation so the class has not been decorated. 
 @since SID_R16.5
*/ 

public  class CommonResourceInfo  {



/**  
* Field source
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0002. 

*/
protected ObjectSource source ;




/**  
* Field resourceState
* See R_TMF518_NRB_I_0001. </br>See SD2-17_EnhancedResourceStates suppor 

* ting document...\SD\SD2-17_EnhancedResourceStates.pdf 

*/
protected ResourceState resourceState ;




/**  
* Field networkAccessDomain
* This attribute contains a free-format string used to associate the res 

* ource to a Network Access Domain. 

*/
protected String networkAccessDomain ;




/**  
* Field ituStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuStateAndStatusList ituStateAndStatusList ;


}