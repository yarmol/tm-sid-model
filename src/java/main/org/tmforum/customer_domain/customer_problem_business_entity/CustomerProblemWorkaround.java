/**
* Customer Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V.h.mT0CUTE.eO.l8K.g.j.cSM.dY.w-content.html">Customer Problem ABE</a> 
* The Customer Problem ABE focuses on technical assistance and problem h 
* andling for customers. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_problem_business_entity ;

/**
* A resolution (sometimes temporary) for a KnownProblemDescription.  
 @since SID_R16.5
*/ 

public  class CustomerProblemWorkaround  {



/**  
* Field commonProblemDescription
*/
protected KnownProblemDescription commonProblemDescription ;




/**  
* Field customerProblem
*/
protected List<CustomerProblem> customerProblem ;




/**  
* Field customerProblemAttachment
*/
protected List<Attachment> customerProblemAttachment ;




/**  
* Field name
* Short readable name for the workaround 

*/
protected String name ;




/**  
* Field description
* A text explaining the workaround for the known problem.  

*/
protected String description ;


}