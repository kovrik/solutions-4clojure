;; ugly
(defn md [defval array]
  (zipmap (reverse array) (vec (replicate (count array) defval))))

(= (md 0 [:a :b :c]) {:a 0 :b 0 :c 0})

(= (md "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})

(= (md [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
