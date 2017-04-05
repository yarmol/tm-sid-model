/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This class represents using the source MAC address value as part of a  
* condition expression. Thus, only BitStringValue and IntegerValue class 
* es can be used in the value portion of the condition expression with t 
* his PolicyVariable. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard" href="_3E3F0EC000E93D77E58C02A1-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::VariableStandard</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable" href="_3E3F0EC000E93D77E58C0298-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class MACVariable extends VariableStandard,PolicyVariable,Policy,RootEntity {



/**  
* Field macAddressList
* This attribute is an unordered list of strings, each specifying a</br> 

* MAC address or a range of MAC addresses. The 802 MAC address canonical 

*  format is used:</br></br> MACaddress = 1*4HEXDIG ":" 1*4HEXDIG ":" 1* 

* 4HEXDIG</br> MACmaskedaddress = MACaddress","MACaddress</br></br>Each  

* string entry is either:</br></br> 1. A single MAC address. Example: 00 

* 00:00A5:0000</br> 2. A MACmaskedaddress address range defined specifie 

* d by</br> an address and mask. The mask specifies the relevant bits in 

* </br> the address. Example: 0000:00A5:0000, FFFF:FFFF:0000 </br> defin 

* es a range of MAC addresses in which the first 4 8-bit </br> bytes are 

*  equal to 0000:00A5</br></br> 

*/
protected String macAddressList ;




/**  
* Field macDirection
* This is an enumerated integer that defines if this variable is used to 

*  represent source addresses, destination addresses, or both. 

*/
protected Integer macDirection ;


}