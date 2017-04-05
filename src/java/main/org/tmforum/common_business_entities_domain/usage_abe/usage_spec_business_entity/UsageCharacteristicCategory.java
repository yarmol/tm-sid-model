/**
* Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kX.g.wIBQBE.d-O57.wBCB.zL.fA-content.html">Usage Spec ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_abe.usage_spec_business_entity ;

/**
* A category representing a high-level aspect of the usage information d 
* escribed by the characteristic. These categories are commonly referred 
*  to as: Who, When, What, Where or Why. 
 @since SID_R16.5
*/ 

public  class UsageCharacteristicCategory  {



/**  
* Field name
* The name of the usage characteristic category. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the usage characteristic category. 

*/
protected String description ;




/**  
* Field usageSpecCharacteristic
*/
protected List<UsageSpecCharacteristic> usageSpecCharacteristic ;


}