/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* This class is used to define a list of MAC addresses and MAC address r 
* ange values as an unordered list of strings, each specifying a MAC add 
* ress or a range of MAC addresses according to the canonical 802 MAC ad 
* dress format. Each string entry is either: - a single MAC address, suc 
* h as 0000:00A5:0000 - a range of MAC addresses specified by an address 
*  and mask, such as 0000:00A5:0000,FFFF:FFFF:0000, which defines a rang 
* e of MAC addresses in which the  first four octets are equal to 0000:0 
* 0A5. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue" href="_3E3F0EC000E93D77E58C02A7-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class MACAddressValue extends PolicyValue,Policy,RootEntity {



/**  
* Field macFormat
* This is an enumerated integer that defines how the MAC Address is repr 

* esented. Values are:</br></br> 0: a single address (e.g., 0000:00A5:00 

* 00)</br> 1: an address with mask (e.g., 0000:00A5:0000, FFFF:FFFF:0000 

* )</br> 

*/
protected Integer macFormat ;




/**  
* Field macValueList
* This is an array of strings, each of which contains a MAC Address. Eac 

* h string must be of the same format, which is specified in the macForm 

* at attribute of this object. 

*/
protected String macValueList ;


}