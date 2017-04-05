/**
* Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kX.g.wIBQBE.d-O57.wBCB.zL.fA-content.html">Usage Spec ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_abe.usage_spec_business_entity ;

/**
* A particular form or variety of a UsageSpecification that is different 
*  from others or from the original. The form represents differences in  
* properties that characterize a UsageSpecification, that are not enough 
*  to warrant creating a new UsageSpecification. 
 @since SID_R16.5
*/ 

public  class UsageSpecVersion  {



/**  
* Field usageSpecRevisionType
* The significance of the revision. 

*/
protected String usageSpecRevisionType ;




/**  
* Field usageSpecRevisionNumber
* A number that represents the occurrence of the version in the sequence 

*  of versions. 

*/
protected Integer usageSpecRevisionNumber ;




/**  
* Field description
* A narrative that explains the reason for the version's creation. 

*/
protected String description ;




/**  
* Field usageSpecRevisionDate
* The date the version was created. 

*/
protected DateTime usageSpecRevisionDate ;




/**  
* Field validFor
* The period during which the version is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field usageSpecification
*/
protected UsageSpecification usageSpecification ;


}