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
* An indication of whether the test is "PROACTIVE" and running at the ti 
* me and entity is created and activated, or whether the test is "ONDEMA 
* ND" 
 @since SID_R16.5
*/ 

public  enum TestMode  {



/**  
* Field ONDEMAND
* ONDEMAND  implies the test was started explicitly via an operation 

*/
 ONDEMAND ,




/**  
* Field PROACTIVE
* PROACTIVE implies the test was start implicitly when an entity was cre 

* ated and actived, vs. explicitly via an operation 

*/
 PROACTIVE ,


}