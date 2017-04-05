/**
* Party Role Examples ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B34027A-content.html">Party Role Examples ABE</a> 
* A set of example PartyRoles that a Party may play. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_examples_business_entity ;

/**
* A Service ProviderEmployee is an Individual who is employed by the Ser 
* vice Provider. This is modeled as an Individual playing the role of Se 
* rviceProviderEmployee . A ServiceProviderEmployee is a type of PartyRo 
* le. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class ServiceProviderEmployee extends PartyRole {



/**  
* Field employmentStatus
* Permitted Values:</br></br>employed, suspended, resource-rebalanced</b 

* r> 

*/
protected String employmentStatus ;




/**  
* Field employeeNr
* A unique identification number for an employee. 

*/
protected String employeeNr ;




/**  
* Field currentSalary
* The current fixed regular payment, typically paid on a monthly or biwe 

* ekly basis but often expressed as an annual sum, made by an employer t 

* o an employee. 

*/
protected Money currentSalary ;


}