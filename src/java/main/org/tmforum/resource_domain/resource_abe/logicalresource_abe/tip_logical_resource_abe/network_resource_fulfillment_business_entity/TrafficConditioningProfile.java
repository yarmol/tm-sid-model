/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents a collection of attributes, which are use 
* d to define the traffic conditioning parameters (e.g., bandwidth chara 
* cteristics) on a Termination Point (TP). See R_TMF518_NRF_I_0052, R_TM 
* F518_NRF_I_0053 and R_TMF518_NRF_I_0054. 
 @since SID_R16.5
*/ 

public  class TrafficConditioningProfile  {



/**  
* Field isDefaultProfile
* This attribute defines the TC Profile as a non-deleteable profile. 

*/
protected Boolean isDefaultProfile ;




/**  
* Field layeredTrafficConditioningParameterList
* This attribute represents a list of traffic conditioning parameters wh 

* ich can be set and/or retrieved at a specified connectionless layer on 

*  a Termination Point (TP) having this TC Profile assigned. Refer to ch 

* apter "Traffic conditioning parameters" of the supporting document SD1 

* -16_LayeredParameters for details of the currently defined traffic con 

* ditioning parameters...\..\Framework\SD\SD1-16_LayeredParameters.pdf 

*/
protected List<TransmissionParameterList> layeredTrafficConditioningParameterList ;




/**  
* Field terminationPoint
*/
protected List<TIPTerminationPoint> terminationPoint ;




/**  
* Field managementDomain
*/
protected TIPManagementDomain managementDomain ;


}