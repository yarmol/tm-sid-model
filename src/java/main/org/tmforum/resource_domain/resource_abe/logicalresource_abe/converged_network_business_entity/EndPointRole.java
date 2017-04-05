/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The focus of the role such as FORWARDING where the role described is r 
* elated to information flow and protection.An EndPoint can have several 
*  role focuses but should always have a FORWARDING role (unless the sim 
* ple endPointId in the EndPoint is used to summarise the role (in simpl 
* e cases)). 
 @since SID_R16.5
*/ 

public  class EndPointRole  {



/**  
* Field roleFocus
* The focus of the role such as FORWARDING where the role described is r 

* elated to information flow and protection.</br>An EndPoint can have se 

* veral role focuses but should always have a FORWARDING role (unless th 

* e simple endPointId in the EndPoint is used to summarise the role (in  

* simple cases)). 

*/
protected EndpointRoleFocus roleFocus ;




/**  
* Field roleFocusGroupAndInstance
* The local name of a group of points in a specific structure of interre 

* lated roles and the instance of the point in that group.</br>This is e 

* ssentially directly equivalent to A1, Z1 but is defined to allow more  

* appropriate terms.</br>The group is used when there are multiple repea 

* ts of the same set of points such as in a DOUBLE_PROTECTED FRE. 

*/
protected String roleFocusGroupAndInstance ;




/**  
* Field rigorousRole
* Name of the role in the context of the specification of the FRE type. 

*/
protected EndpointRole rigorousRole ;




/**  
* Field softRole
* An local name for the role that is not rigorously defined in the FRE t 

* ype but is appropriately unique as per the definition of the FRE type. 

*/
protected String softRole ;




/**  
* Field additionalRoleInfo
* Where the role needs more information. 

*/
protected List<String> additionalRoleInfo ;


}