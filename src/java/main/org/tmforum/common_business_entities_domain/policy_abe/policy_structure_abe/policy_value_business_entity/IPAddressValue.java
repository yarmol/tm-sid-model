/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* This class is used to provide an unordered list of IPv4 addresses, IPv 
* 6 addresses, ranges of IPv4 addresses, ranges of IPv6 addresses, and h 
* ostnames to be matched against in a policy condition. The format of ea 
* ch string is specified according to the ABNF definition of an IPv4 add 
* ress.If a hostname is matched against another valid IP address, the ma 
* tch is done by resolving the hostname intoa valid IPv4 or IPv6 address 
* . Matching hostnames against each other, like matching IP addresses (o 
* f the same type) against each other, is done using a string comparison 
* . Matching an IPv4 address against an IPv6 address fails. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue" href="_3E3F0EC000E93D77E58C02A7-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IPAddressValue extends PolicyValue,Policy,RootEntity {



/**  
* Field valueAddressFormat
* This is an enumerated integer attribute that contains one of 5 differe 

* nt representations for an address or address range, as specified below 

* :</br></br> - 0: a single address in dot notation, such as 12.1.1.2</b 

* r> - 1: an address range specified by an address with a prefix,</br> s 

* uch as 12.1.1.0/15</br> - 2: an address range specified by a starting  

* address in dot</br> notation and an ending address in dot notation, se 

* parated</br> by "-". The range includes all addresses between the</br> 

*  range's starting and ending addresses, including these two</br> addre 

* sses, such as 12.1.1.3-12.1.22.5</br> - 3: an address range specified  

* by an address and</br> mask. The address and mask are represented in d 

* ot</br> notation, separated by a comma ",", such as</br> 2.3.128.0,255 

* .255.248.0.</br> - 4: a single Hostname, as specified in RFC1035</br> 

*/
protected Integer valueAddressFormat ;




/**  
* Field typeOfAddress
* This is an enumerated integer that is used to specify the type of IP a 

* ddress that this instance represents. Values include:</br></br> 1: IPv 

* 4</br> 2: IPv6</br> 3: hostname</br> 

*/
protected Integer typeOfAddress ;




/**  
* Field addressValueList
* This is an array of string values. Each string value contains a partic 

* ular value to filter on. Note that all values must have the format spe 

* cified in the Format attribute of this class. 

*/
protected String addressValueList ;


}