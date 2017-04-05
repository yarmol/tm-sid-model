/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This is a concrete base class that provides a general extension mechan 
* ism for representing PolicyConditions that have not been modeled with  
* the attributes specified in this model. This class uses two of its pro 
* perties (constraintData and constraintEncoding) for defining the conte 
* nt and format of a vendor-specific condition. Its other two attributes 
*  are used to describe the type of condition that this represents, and  
* to provide a standard definition of a TRUE or FALSE response. This lat 
* ter enables this object to interoperate with other PolicyVariableStand 
* ard objects as part of a PolicyConditon clause.Standardized extensions 
*  are not expected to use this class. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyConditionVendor extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field constraintData
* The constraintData attribute is a string that provides a general exten 

* sion mechanism for representing PolicyConditions that have not been mo 

* deled with specific attributes (as specified in this model). The forma 

* t of this attribute is determined by the OID value stored in the const 

* raintEncoding attribute of this class. The constraintEncoding attribut 

* e provides a convenient and simple mechanism by which a Policy Server  

* can determine whether it supports the values stored in an instance of  

* constraintData. If it doesn't recognize any of the OID values in the c 

* onstraintEncoding attribute, then it will not know how to interpret th 

* e data in the corresponding constraintData attributes. The action for  

* the policy decision point to take in case it does not recognize the fo 

* rmat of this data could itself be modeled as a PolicyRule, governing t 

* he behavior of the Policy Server.</br></br>Notes:</br>Not present in t 

* he ITU specs. The CIM defines a similar attribute called Constraint. 

*/
protected String constraintData ;




/**  
* Field constraintEncoding
* The constraintEncoding attribute is a string that is used to represent 

*  an OID that in turn identifies the encoding and semantics of the cons 

* traintData attribute in this instance.</br></br>Notes: Not present in  

* the ITU specs. The CIM defines a similar attribute called ConstraintEn 

* coding. 

*/
protected String constraintEncoding ;




/**  
* Field conditionType
* This is a free-form string that can be used to define the type of cond 

* ition that this instance is checking.</br></br>Notes: Not present in t 

* he ITU or CIM specs. 

*/
protected String conditionType ;




/**  
* Field conditionResponse
* This is a Boolean attribute that is used to allow a 'standard' definit 

* ion of a TRUE/FALSE response to be made by an external system attached 

*  to the model at this point. This will allow integration with a genera 

* lized policy processing engine.</br></br>Notes: Not present in the ITU 

*  or CIM specs. 

*/
protected Boolean conditionResponse ;


}