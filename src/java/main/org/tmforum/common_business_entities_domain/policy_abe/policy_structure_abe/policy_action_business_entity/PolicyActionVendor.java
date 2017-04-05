/**
* Policy Action ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AD70316-content.html">Policy Action ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_action_business_entity ;

/**
* The PolicyActionVendor class is a concrete base class that provides a  
* general extension mechanism for representing PolicyActions that have n 
* ot been modeled with the attributes specified in this model. This clas 
* s uses two of its properties (Constraint and ConstraintEncoding) for d 
* efining the content and format of a vendor-specific condition. Its thi 
* rd property (actionResponse) to provide a standard result, so that thi 
* s object can be placed with other PolicyAction objects in a PolicyRule 
*  object. Standardized extensions are not expected to use this class. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Action ABE::PolicyAction" href="_3E3F0EC000E93D77E58C02E2-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Action ABE::PolicyAction</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyActionVendor extends PolicyAction,Policy,RootEntity {



/**  
* Field actionData
* This attribute provides a general extension mechanism for representing 

*  policy actions that have not been modeled with the specific propertie 

* s contained in this model. The format of this attribute is determined  

* by the OID value stored in the ActionEncoding attribute.</br></br>A po 

* licy decision point can readily determine whether it supports the valu 

* es stored in an instance of ActionData by checking the OID value from  

* ActionEncoding against the set of OIDs it recognizes. The action for t 

* he policy decision point to take in case it does not recognize the for 

* mat of this data could itself be modeled as a PolicyRule, governing th 

* e behavior of the policy decision point.</br></br>Notes:</br>Not prese 

* nt in the ITU specs. The CIM defines a similar attribute called Action 

* Data. 

*/
protected String actionData ;




/**  
* Field actionEncoding
* This is a string attribute. It is used to represent an OID that in tur 

* n identifies the encoding and semantics of the ActionData attribute va 

* lue array in this instance. The value of this property is a single str 

* ing, representing a single OID.</br></br>Notes: Not present in the ITU 

*  specs. The CIM defines a similar attribute called ActionEncoding. 

*/
protected String actionEncoding ;




/**  
* Field actionResponse
* This is a Boolean attribute that is used to allow a 'standard' definit 

* ion of a TRUE/FALSE response to be made by an external system attached 

*  to the model at this point. This will allow integration with a genera 

* lized policy processing engine.</br></br>notes: Not defined in the ITU 

*  or CIM specs. 

*/
protected Boolean actionResponse ;


}