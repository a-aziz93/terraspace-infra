# This is where you put your backend declaration. Example:
#
# terraform {
#   backend "local" {
#     path = "terraform.tfstate"
#   }
# }
#
# More examples: https://terraspace.cloud/docs/config/backend/examples/
#

terraform {
  backend "kubernetes" {
    secret_suffix = "state"
    config_path   = "~/.kube/config"
  }
}