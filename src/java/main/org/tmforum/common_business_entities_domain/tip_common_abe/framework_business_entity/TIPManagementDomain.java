/**
* Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.oGG8J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.tip_common_abe.framework_business_entity ;

/**
* One or more ManagementDomains are used to represent the managed networ 
* k of a service provider (i.e., a portion of a network) in the context  
* of a given CCV. Each network resource is contained under exactly one M 
* anagementDomain. Each OS on the CCV may store part or whole inventory  
* associated with one or more ManagementDomains. A top-level OS may mana 
* ge part or all of one or more ManagementDomains. See R_TMF518_FMW_I_00 
* 04 and R_TMF518_FMW_I_0006. 
 @since SID_R16.5
*/ 

public  class TIPManagementDomain  {



/**  
* Field flowDomain
*/
protected List<FlowDomain> flowDomain ;




/**  
* Field topologicallink
*/
protected List<TopologicalLink> topologicallink ;




/**  
* Field managedElement
*/
protected List<ManagedElement> managedElement ;




/**  
* Field multiLayerSubNetwork
*/
protected List<MultiLayerSubNetwork> multiLayerSubNetwork ;




/**  
* Field trafficConditioningProfile
*/
protected List<TrafficConditioningProfile> trafficConditioningProfile ;


}