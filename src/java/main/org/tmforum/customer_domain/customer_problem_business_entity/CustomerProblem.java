/**
* Customer Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V.h.mT0CUTE.eO.l8K.g.j.cSM.dY.w-content.html">Customer Problem ABE</a> 
* The Customer Problem ABE focuses on technical assistance and problem h 
* andling for customers. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_problem_business_entity ;

/**
* Represents a problem which affects the Customer experience. CustomerPr 
* oblem can be raised by the Customer (a complaint) or by the CSP (typic 
* ally through some analytics system) 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class CustomerProblem extends BusinessInteraction {



/**  
* Field customerProblemDescription
*/
protected KnownProblemDescription customerProblemDescription ;




/**  
* Field closeCustomerProblemSummary
*/
protected List<CloseCustomerProblemSummary> closeCustomerProblemSummary ;




/**  
* Field customerProblemWorkaround
*/
protected CustomerProblemWorkaround customerProblemWorkaround ;




/**  
* Field customerProblemTask
*/
protected List<CustomerProblemTask> customerProblemTask ;




/**  
* Field severity
* The severity of the CustomerProblem (in the eyes of the CSP). 

*/
protected String severity ;


}