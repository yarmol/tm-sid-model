/**
* Customer Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V.h.mT0CUTE.eO.l8K.g.j.cSM.dY.w-content.html">Customer Problem ABE</a> 
* The Customer Problem ABE focuses on technical assistance and problem h 
* andling for customers. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_problem_business_entity ;

/**
* Records the closure activity of a CustomerProblem. There may be more t 
* han one CloseCustomerProblemSummary per CustomerProblem because Custom 
* erProblems can be reopened, or a temporary solution may be replaced by 
*  a permanent one. 
 @since SID_R16.5
*/ 

public  class CloseCustomerProblemSummary  {



/**  
* Field customerProblem
*/
protected CustomerProblem customerProblem ;




/**  
* Field closeDate
* The date in which the CustomerProblem was closed 

*/
protected DateTime closeDate ;




/**  
* Field ID
* A unique identifier that enables different instances of a CloseCustome 

* rProblemSummary to be distinguished from each other. 

*/
protected String ID ;




/**  
* Field summary
* A textual description of the solution applied to the CustomerProblem 

*/
protected String summary ;


}