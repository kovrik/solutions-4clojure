(defn rev [s] (= (reverse s) (reverse (reverse s))))


(false? (rev '(1 2 3 4 5)))


(true? (rev "racecar"))


(true? (rev [:foo :bar :foo]))


(true? (rev '(1 1 3 3 1 1)))


(false? (rev '(:a :b :c)))
