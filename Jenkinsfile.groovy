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
                                            input( "Is the previous build successful?")
				           }

			        }
 		         

			           }
			   stage('Three')
			        {
					agent{
						docker{
							image 'ubuntu'
						     }
					     }
                                     steps{
                                            echo 'testing'
				           }

			        }
 		
            }
}
