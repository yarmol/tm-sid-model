/**
* Policy Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4A79039D-content.html">Policy Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity ;

import org.tmforum.common_business_entities_domain.policy_abe.policy_application_business_entity.PolicyApplication;
import org.tmforum.common_business_entities_domain.policy_abe.policy_application_business_entity.PolicyRepository;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.RootEntity;

import java.util.List;

/**
* This is an abstract base class, and is the root of the Policy model. A 
* s such, it defines common attributes, methods and relationships that a 
* ll policy subclasses use and take part in. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Policy extends RootEntity {



/**  
* Field policyApplication
*/
protected List<PolicyApplication> policyApplication ;




/**  
* Field keywords
* This is a string attribute that defines a set of one or more keywords  

* that a policy administrator may use to assist in characterizing or cat 

* egorizing a policy object to facilitate search operations. The followi 

* ng keywords are pre-defined:</br></br>Permitted Values: </br>Unknown I 

* nstallPermissions</br> ConfigChange InstallMethod</br> Default Error</ 

* br> Usage InternalError</br> Security ExternalError</br> Authenticatio 

* n Notification</br> Authorization Publish</br> Accounting Subscribe</b 

* r> Auditing Publish-Subscribe</br> Service Exception</br> CustomerFaci 

* ngService </br> ResourceFacingService</br></br>Notes: Not present in t 

* he ITU specs; the CIM defines a PolicyKeyword attribute, but its seman 

* tics are very different. 

*/
protected String keywords ;




/**  
* Field policyName
* This is a generic naming attribute that can be used to identify differ 

* ent policy entities. This enables commonName to be used to enforce ent 

* erprise or service provider generic naming and this attribute to be us 

* ed to fine tune the naming of policy entities. Thus, commonName is pub 

* lic in scope and policyName is private to policy.</br></br>Notes: </br 

* >Not present in the ITU specs or CIM specs. 

*/
protected String policyName ;




/**  
* Field policyRepository
*/
protected List<PolicyRepository> policyRepository ;




/**  
* Field policyDomain
*/
protected PolicyDomain policyDomain ;


}