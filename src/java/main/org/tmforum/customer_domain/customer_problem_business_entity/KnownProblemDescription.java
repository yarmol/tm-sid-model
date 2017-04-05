/**
* Customer Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V.h.mT0CUTE.eO.l8K.g.j.cSM.dY.w-content.html">Customer Problem ABE</a> 
* The Customer Problem ABE focuses on technical assistance and problem h 
* andling for customers. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_problem_business_entity ;

/**
* A description of a known problem, optionally with some known workaroun 
* ds. It may be shared by multiple CustomerProblems. 
 @since SID_R16.5
*/ 

public  class KnownProblemDescription  {



/**  
* Field customerProblem
*/
protected List<CustomerProblem> customerProblem ;




/**  
* Field customerProblemWorkaround
*/
protected List<CustomerProblemWorkaround> customerProblemWorkaround ;




/**  
* Field name
* Short readable name for the known problem 

*/
protected String name ;




/**  
* Field description
* A text explaining the problem and its possible sources 

*/
protected String description ;


}