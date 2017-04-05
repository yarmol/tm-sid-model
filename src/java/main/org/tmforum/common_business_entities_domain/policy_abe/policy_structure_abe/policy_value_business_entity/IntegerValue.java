/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* This class provides a list of integer or integer range values. Each in 
* teger can be of an arbitrary size. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue" href="_3E3F0EC000E93D77E58C02A7-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class IntegerValue extends PolicyValue,Policy,RootEntity {



/**  
* Field valueIntegerList
* This attribute is an array of strings, defined as an unordered list, w 

* here each integer in the list is represented by a string. This is done 

*  to accommodate the reserved words "INFINITY" and "-INFINITY". The for 

* mat of this attribute takes one of the following two forms:</br></br>  

* - a single integer value</br> - a range of integers. The range is spec 

* ified by a starting</br> integer and an ending integer, separated by ' 

* ..'. The</br> starting integer must be less than or equal to the endin 

* g</br> integer. The range includes all integers between the </br> star 

* ting and ending integers, including these two integers.</br></br>To re 

* present a range of integers that is not bounded, the reserved words "- 

* INFINITY" and/or "INFINITY" can be used in place of the starting and e 

* nding integers.</br> 

*/
protected Integer valueIntegerList ;


}