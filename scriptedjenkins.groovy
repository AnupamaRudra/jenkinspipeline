node {
    for(int i=0;i<2;i++)
    {
        stage "Stage#"+i
        print "Hi"
        if(i==0)
        {
            git "https://github.com/AnupamaRudra/jenkinspipeline.git"
            echo  "Yo stage 0"
        }
        else
        {
            build 'decpipe1'
            echo "Yo stage 1"
        }
    }
}
