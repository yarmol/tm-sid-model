/**
* Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C174B400CC-content.html">Usage ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_business_entity ;

/**
* A single usage related entity that is used to represent the three diff 
* erent types of usage, each one specified by the usageState attribute. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Usage ABE::Usage" href="_3E3F0EC000E941C175ED0356-content.html">SID Models::Common Business Entities Domain::Usage ABE::Usage</a> @since SID_R16.5
*/ 

public  class ContextUsage extends Usage {



/**  
* Field usageState
* The state of the usage. Values are "resource usage", "service usage" o 

* r "product usage" that indicate possible states in the movement toward 

* s product usage, such as from resource to service to product usage. 

*/
protected String usageState ;


}