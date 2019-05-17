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
                                            input( "Are you fine?")
				           }

			        }
 		          stage('Three')
			          {
					  when{
					    not{
						    branch 'master'
					       }
					     }
                                           steps{
                                              echo "Hello"
				             }

			           }
			   stage('Four')
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
