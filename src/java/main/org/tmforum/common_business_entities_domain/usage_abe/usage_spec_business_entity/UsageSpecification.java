/**
* Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kX.g.wIBQBE.d-O57.wBCB.zL.fA-content.html">Usage Spec ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_abe.usage_spec_business_entity ;

/**
* A detailed description of a usage event that are of billing system's i 
* nterest and can have charges applied to it. It is comprised of charact 
* eristics, which define all attributes known for a particular type of u 
* sage. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage Example Instances ABE::VoiceCallUsage2 : UsageSpecification @since SID_R16.5
*/ 

public abstract class UsageSpecification extends VoiceCallUsage2 : UsageSpecification {



/**  
* Field name
* The name of the usage specification. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the product specification is. 

*/
protected String description ;




/**  
* Field lifecycleStatus
* The condition of the usage specification, such as active, inactive, pl 

* anned. 

*/
protected Integer lifecycleStatus ;




/**  
* Field validFor
* The period for which the usage specification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field usage
*/
protected List<Usage> usage ;




/**  
* Field usageSpecCharacteristic
*/
protected List<UsageSpecCharacteristic> usageSpecCharacteristic ;




/**  
* Field usageSpecVersion
*/
protected List<UsageSpecVersion> usageSpecVersion ;


}