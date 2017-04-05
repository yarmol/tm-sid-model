/**
* Customer Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V.h.mT0CUTE.eO.l8K.g.j.cSM.dY.w-content.html">Customer Problem ABE</a> 
* The Customer Problem ABE focuses on technical assistance and problem h 
* andling for customers. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_problem_business_entity ;

/**
* A trackable task delegated from the CustomerProblem with a specified d 
* ue date 
 @since SID_R16.5
*/ 

public  class CustomerProblemTask  {



/**  
* Field customerProblem
*/
protected CustomerProblem customerProblem ;




/**  
* Field creationDate
* The date and time in which the CustomerProblemTask was created 

*/
protected DateTime creationDate ;




/**  
* Field dueDate
* The date and time in which the CustomerProblemTask should be completed 

*/
protected DateTime dueDate ;




/**  
* Field status
* The current status of the task. Possible values (among others) are Wai 

* ting, In Process, Completed, Failed, Rejected  

*/
protected String status ;




/**  
* Field ID
* A unique identifier that enables different instances of a CustomerProb 

* lemTask to be distinguished from each other. 

*/
protected String ID ;


}