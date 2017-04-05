/**
* Resource Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_0D.iKAFL8E.eS.r_.v9.y.r.bM0P.g-content.html">Resource Test ABE</a> 
* <p>A resource test is an execution of functionality on a resource that 
*  results in measures being produced. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_test_business_entity ;

/**
* An entity that exists for a controlled test invocation on a resource.  
* The resource test is executed according to a schedule. and contains re 
* source test configuration parameters that are to be applied at executi 
* on time, and resource test measures that result.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Test ABE::Test @since SID_R16.5
*/ 

public  class ResourceTest extends Test {



/**  
* Field resource
*/
protected Resource resource ;


}