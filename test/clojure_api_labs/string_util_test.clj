(ns clojure-api-labs.string-util-test
  (:require [clojure.test :refer :all]
            [clojure-api-labs.string-util :refer :all]))

(deftest non-blank?-test
  (testing "non blank strings"
    (is (non-blank? "something"))
    (is (= (non-blank? "") false))))

(deftest max-length?-test
  (testing ""
    (is (max-length? 50 "Less than 50 characters"))
    (is (= (max-length? 5 "More than 5 characters")
           false))))

(deftest non-blank-with-max-length?-test
  (testing ""
    (is (non-blank-with-max-length? 50 "Less than 50 characters"))
    (is (= (non-blank-with-max-length? 5 "More than 5 characters")
           false))
    (is (= (non-blank-with-max-length? 0 "")
           false))))

(deftest min-length?-test
  (testing ""
    (is (min-length? 5 "More than 5 characters"))
    (is (= (min-length? 25 "Less than 25 characters")
           false))))

(deftest length-in-range?-test
  (testing ""
    (is (length-in-range? 5 30 "Between 5 and 30 characters"))
    (is (= (length-in-range? 5 25 "five")
           false))
    (is (= (length-in-range? 5 25 "More than 25 characters for sure")
           false))))

(deftest email?-test
  (testing ""
    (is (email? "tk@mail.com"))
    (is (= (email? "") false))
    (is (= (email? "tk.com") false))
    (is (= (email? "@mail.com") false))))
