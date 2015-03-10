#!/bin/bash
#clear
echo "Script For Automation Deployment"
cd /bin/Project1
echo "Input message for commit:"
read message
git add .
git commit $messsage
git push origin master
#echo $message
