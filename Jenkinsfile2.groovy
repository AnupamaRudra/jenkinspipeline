pipeline{

   
     agent any

      stages{
 		      stage('One')
		          	{
                                   steps{
                                    echo "Hi"
	                                }
                 }
			
 		        stage('Two')
			             {
                                     steps{
                                            build 'first'
                                            }
				           }

			        }
 		        
 		
            
}
