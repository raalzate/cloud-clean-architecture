##Create backet
aws s3 mb s3://techandsolve.com

##Add public policy
aws s3api put-bucket-policy --bucket techandsolve.com --policy file://policy.json
