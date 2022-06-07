# Docs: https://terraspace.cloud/docs/config/reference/
Terraspace.configure do |config|
  config.logger.level = :debug
  config.test_framework = "rspec"
  config.all.concurrency = 5
end
