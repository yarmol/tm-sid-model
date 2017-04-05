/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class is used to represent a single or set of bit string variable 
* . Thus, only BitStringValue classes can be used in the value portion o 
* f the condition expression with this PolicyVariable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class BitStringVariable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field variableBitStringList
* This attribute is an unordered list of strings, each representing </br 

* >a single bit string or a set of bit strings. The number of bits </br> 

* specified SHOULD equal the number of bits of the expected variable. Fo 

* r example, for an 8-bit byte variable, 8 bits should be specified. If  

* the variable does not have a fixed length, the most significant bits s 

* hould be used. The formal definition of a bit string is:</br> </br> bi 

* nary-digit = "0" / "1"</br> bitstring = 1*binary-digit</br> maskedBitS 

* tring = bitstring","bitstring</br></br>Each string entry is either:</b 

* r></br> 1. A single bit string. Example: 00111010</br> 2. A range of b 

* it strings specifies using a bit string and a bit</br> mask. The bit s 

* tring and mask properties have the same </br> number of bits specified 

* . The mask bit string specifies the </br> significant bits in the bit  

* string value. For example, 110110, </br> 100110 and 110111 would match 

*  the maskedBitString </br> 100110,101110 but 100100 would not.</br> 

*/
protected String variableBitStringList ;


}