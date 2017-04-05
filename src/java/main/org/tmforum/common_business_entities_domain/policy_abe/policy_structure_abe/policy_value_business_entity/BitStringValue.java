/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* This class is used to represent a single or a set of bit string values 
* . A bit string is defined as a string whose individual characters have 
*  the value "0" or "1". No other values are allowed. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue" href="_3E3F0EC000E93D77E58C02A7-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class BitStringValue extends PolicyValue,Policy,RootEntity {



/**  
* Field valueBitStringList
* This attribute is an array of strings, defined in an unordered list ,  

* each representing a single bit string or a set of bit strings. Each st 

* ring entry is either:</br></br> - a single bit string, such as 1111010 

* 1</br> - a range of bit strings specified using a bit string and a bit 

* </br> mask. The bit string and mask fields must have the same </br> nu 

* mber of bits specified. The mask bit string specifies the </br> signif 

* icant bits in the bit string value. An example is:</br> 100110,101110< 

* /br> 

*/
protected String valueBitStringList ;


}