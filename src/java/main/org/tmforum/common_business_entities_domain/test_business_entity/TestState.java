/**
* Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_CN2.cED6.jE.eS.l.f7G.uC.b7.u.hA-content.html">Test ABE</a> 
* A test is a function performed on a product, service, or resource that 
*  results in measures being produced that reflect the functioning of th 
* e entity under test. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.test_business_entity ;

/**
* Represents the state of the test at any given time 
 @since SID_R16.5
*/ 

public  enum TestState  {



/**  
* Field COMPLETED
* The test has completed 

*/
 COMPLETED ,




/**  
* Field FAILED
* The test has failed execution 

*/
 FAILED ,




/**  
* Field ONGOING
* The test is in the process of execution 

*/
 ONGOING ,




/**  
* Field STARTING
* The test is beginning to execute 

*/
 STARTING ,




/**  
* Field STOPPED
* The test has been explicitly stopped via an operation 

*/
 STOPPED ,




/**  
* Field UNKNOWN
* The state of the test is unknown. 

*/
 UNKNOWN ,


}