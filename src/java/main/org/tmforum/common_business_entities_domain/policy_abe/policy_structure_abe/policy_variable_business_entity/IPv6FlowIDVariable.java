/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class represents using the value of the flow ID in the specified  
* packet header as part of a condition expression. The specific packet h 
* eader to use is specified in the flowHeaderNumber attribute of this cl 
* ass. Thus, only IntegerValue and BitStringValue classes can be used in 
*  the value portion of the condition expression with this Variable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IPv6FlowIDVariable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field flowIDHeaderNumber
* This attribute is an enumerated integer that defines the particular pa 

* cket header that contains the IPv6 flow ID information. Specifying the 

*  packet header is necessary in case the address is tunneled. In this c 

* ase, it is mandatory that the correct address be chosen for comparison 

* . Values are:</br></br> 0: outermost header</br> 1: next innermost hea 

* der</br> 2: second innermost header</br></br>etc.</br> 

*/
protected Integer flowIDHeaderNumber ;




/**  
* Field v6HeaderNumber
* This attribute is an enumerated integer that defines the particular pa 

* cket header that contains the IPv6 address information. Specifying the 

*  packet header is necessary in case the address is tunneled. In this c 

* ase, it is mandatory that the correct address be chosen for comparison 

* . Values are:</br></br> 0: outermost header</br> 1: next innermost hea 

* der</br> 2: second innermost header</br></br>etc.</br> 

*/
protected Integer v6HeaderNumber ;


}